package bankmanagementsystem;

public interface PayableTax extends Payable{
    boolean setTax(double savingTaxRate);
    double getTax();
}