package bankmanagementsystem;
import java.util.ArrayList;
import java.util.Date;

public abstract class Account implements Comparable, Summable, Payable{
    private final int accountNo;
    private final String accountType;
    private final Date accountCreationDate;
    private final double accountInitialBalance;
    protected double accountCurrentBalance;
    private final Currency accountCurrency;
    protected final ArrayList<Transaction> accountTransactionsList;
    private static int accountSN = 100000;
    
    //constructor
    public Account(String accountType, double accountInitialBalance, Currency accountCurrency) {
        this.accountNo = Account.accountSN++;
        this.accountType = accountType;
        this.accountCreationDate = new Date();
        this.accountInitialBalance = accountInitialBalance;
        this.accountCurrentBalance = this.accountInitialBalance;
        this.accountCurrency = accountCurrency;
        accountTransactionsList = new ArrayList<>();
    }

    //accessors
    public int getAccountNo() {
        return this.accountNo;
    }
    public String getAccountType() {
        return this.accountType;
    }
    public String getAccountCreationDate() {
        return this.accountCreationDate.toString();
    }
    public double getAccountInitialBalance() {
        return this.accountInitialBalance;
    }
    public double getAccountCurrentBalance() {
        return this.accountCurrentBalance;
    }
    public Currency getAccountCurrency() {
        return this.accountCurrency;
    }
    public Object[] getAccountTransactionsList() {
        return accountTransactionsList.toArray();
    }
    public static int getAccountSN() {
        return Account.accountSN;
    }
    
    
    //withdraw abstract method
    public abstract boolean withdrawAmount(double amount);
    //deposit abstract method
    public abstract boolean depositAmount(double amount);
    
    //equality concrete method from class String
    @Override
    public boolean equals(Object account) {
        if (account instanceof Account)
            return this.accountCurrentBalance == ((Account) account).accountCurrentBalance
                    && this.accountCurrency == ((Account) account).accountCurrency;
        return false;
    }
    //compareTo concrete method from interface Comparable
    @Override
    public int compareTo(Object account) {
        if(account instanceof Account) {
            if(this.accountCurrentBalance > ((Account)account).accountCurrentBalance)
                return 1;
            if(this.accountCurrentBalance < ((Account)account).accountCurrentBalance)
                return -1;
            return 0;
        }
        return -0;
    }
    //sum concrete method from interface Summable
    @Override
    public double sum() {
        double totalTransactions = 0;
        for(Transaction transaction : this.accountTransactionsList) {
            if(transaction.getTransactionType() == TransactionType.W)
                totalTransactions -= transaction.getTransactionAmount();
            else
                totalTransactions += transaction.getTransactionAmount();
        }
        return totalTransactions;
    }
    //pay concrete method from interface Payable
    @Override
    public boolean pay() {
        return this.withdrawAmount(this.accountCurrentBalance * SavingAccount.savingTaxRate);
    }
    @Override
    public boolean pay(double amountPaid) {
        return this.withdrawAmount(amountPaid);
    }
    
    //printing methods
    @Override
    public String toString()
    {
        String accountDescription = "\n**********Account Data**********";
        accountDescription += "\nNo: " + this.accountNo;
        accountDescription += "\nType: " + this.accountType;
        accountDescription += "\nCreation Date: " + this.accountCreationDate;
        accountDescription += "\nInitial Balance: " + this.accountInitialBalance;
        accountDescription += "\nCurrecy: ";
        switch(this.accountCurrency)
        {
            case EGP: accountDescription += "Egyptian Pound";break;
            case USD: accountDescription += "United States Dollar";break;
            case SAR: accountDescription += "Saudi Arabia Riyal";break;
            case EUR: accountDescription += "European Union Euro";break;
            case GBP: accountDescription += "British Pound Sterling";break;
        }
        
        accountDescription += "\nTransactions:";
        for(Transaction transaction : this.accountTransactionsList)
            accountDescription += transaction.toString();
        accountDescription += "\nSum of Transactions: " + this.sum();
        accountDescription += "\nCurrent Balance: " + this.accountCurrentBalance;      
        return accountDescription;
    }
}