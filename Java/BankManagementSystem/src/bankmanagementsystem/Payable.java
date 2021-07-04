package bankmanagementsystem;

public interface Payable {
    boolean pay();
    boolean pay(double amountPaid);
}