package bankmanagementsystem;

public final class SavingAccount extends Account implements PayableTax{
    //data field
    private float interestRate;
    private int overdraftLimit;
    protected static double savingTaxRate;
    
    //constructors
    public SavingAccount(double accountInitialBalance, Currency accountCurrency, float interestRate, int overdraftLimit) {
        super("Saving", accountInitialBalance, accountCurrency);
        this.interestRate = interestRate;
        this.overdraftLimit = correctingOverdraftLimit(overdraftLimit);
    }

    //checking methods
    private int correctingOverdraftLimit(int overdraftLimit) {
        return Math.abs(overdraftLimit) * -1;
    }
    
    //accessors
    public float getInterestRate() {
        return this.interestRate;
    }
    public int getOverdraftLimt() {
        return this.overdraftLimit;
    }
    
    //mutators
    public void setInterestRate(float interestRate) {
        this.interestRate = interestRate;
    }
    public void setOverdraftLimit(int overdraftLimit) {
        this.overdraftLimit = correctingOverdraftLimit(overdraftLimit);
    }
    
    //withdraw method
    @Override
    public final boolean withdrawAmount(double amount) {
        if(amount <= 0)
            return false;
        
        if(this.accountCurrentBalance - amount >= this.overdraftLimit) {
            this.accountCurrentBalance -= amount;
            this.accountTransactionsList.add(new Transaction(TransactionType.W, amount));
            return true;
        }
        
        return false;
    }
    @Override
    //deposit method
    public final boolean depositAmount(double amount) {  
        if(amount <= 0)
            return false;

        this.accountCurrentBalance += Math.round(amount * (1 + this.interestRate));
        this.accountTransactionsList.add(new Transaction(TransactionType.D, amount));
        return true;
    }
    
    //getTax concrete method from interface PayableTax
    @Override
    public double getTax() {
        return SavingAccount.savingTaxRate;
    }
    //setTax concrete method from interface PayableTax
    @Override
    public boolean setTax(double savingTaxRate) {
        if(savingTaxRate > 0 && savingTaxRate < 1) {
            SavingAccount.savingTaxRate = savingTaxRate;   
            return true;
        }
        return false;
    }
    
    //printing methods
    @Override
    public String toString() {
        String SavingAccountDescription = super.toString();
        SavingAccountDescription += "\nInterest rate: " + this.interestRate + "%";
        SavingAccountDescription += "\nOverdraft Limit: " + this.overdraftLimit;
        SavingAccountDescription += "\nSaving Tax Rate: " + SavingAccount.savingTaxRate + "%";
        return SavingAccountDescription;
    }
}