package bankmanagementsystem;
import java.util.Date;

public class Transaction {
    //data field
    private final int transactionCode;
    private final TransactionType transactionType;
    private final Date transactionDate;
    private double transactionAmount;
    private static int transactionSN;
    
    //constructors
    public Transaction(TransactionType transactionType, double transactionAmount) {
        this.transactionCode = ++transactionSN;
        this.transactionType = transactionType;
        this.transactionDate = new Date();
        if(this.isValidAmount(transactionAmount))
            this.transactionAmount = transactionAmount;
    }
    
    //checking methods
    private boolean isValidAmount(double amount) {
        return amount > 0;
    }
    
    //accessors
    public int getTransactionCode() {
        return this.transactionCode;
    }
    public TransactionType getTransactionType() {
        return this.transactionType;
    }
    public String getTransactionDate() {
        return this.transactionDate.toString();
    }
    public double getTransactionAmount() {
        return this.transactionAmount;
    }
    public static int getTransactionSN() {
        return Transaction.transactionSN;
    }
    
    //printing methods
    @Override
    public String toString()
    {
        String transactionDescription = "\nTransaction " + this.transactionCode + ": ";
        transactionDescription += (this.transactionType == TransactionType.W ? "Withdraw" : "Deposit ") + " of ";
        transactionDescription += (this.transactionType == TransactionType.W ? "-" : "+") + this.transactionAmount + " at ";
        transactionDescription += this.transactionDate + ".";
        
        return transactionDescription;
    }
}