package bankmanagementsystem;

public final class CheckingAccount extends Account {
    //constructors
    public CheckingAccount() {
        this(3000, Currency.EGP);
    }
    public CheckingAccount(double accountInitialBalance, Currency accountCurrency) {
        super("Checking", accountInitialBalance, accountCurrency);
    }
    
    //withdraw method
    @Override
    public final boolean withdrawAmount(double amount) {
        if(amount <= 0 && amount > this.accountCurrentBalance)
            return false;
        
        this.accountCurrentBalance -= amount;
        this.accountTransactionsList.add(new Transaction(TransactionType.W, amount));
        return true;
    }
    //deposit method
    @Override
    public final boolean depositAmount(double amount) {
        if(amount <= 0)
            return false;
        
        this.accountCurrentBalance += amount;
        this.accountTransactionsList.add(new Transaction(TransactionType.D, amount));
        return true;
    }
}