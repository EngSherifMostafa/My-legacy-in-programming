package bankmanagementsystem;
import java.util.ArrayList;

public class Customer {
    //data field
    private final String customerName;
    private final String customerID;
    private final int customerBranchCode;
    private final ArrayList<Account> customerAccountsList;
    
    //constructor
    public Customer(String customerName, String customerID, int customerBranchCode) {
        if (this.isValidCustomerName(customerName)
                && this.isValidCustomerID(customerID)
                && this.isValidCustomerBranchCode(customerBranchCode)) {
            this.customerName = customerName;
            this.customerID = customerID;
            this.customerBranchCode = customerBranchCode;
            this.customerAccountsList = new ArrayList<>();
        }
        else {
            this.customerName = "";
            this.customerID = "";
            this.customerBranchCode = 1;
            this.customerAccountsList = new ArrayList<>();
        }
    }

    //checking methods
    private boolean isValidCustomerName(String customerName) {
        customerName = customerName.trim();
        if (customerName.isEmpty())
            return false;
        
        for (int i = 0; i < customerName.length(); i++) {
            if (!Character.isLetter(customerName.charAt(i)))
                return false;
        }
        return true;
    }
    private boolean isValidCustomerID(String customerID) {
        if (customerID.isEmpty())
            return false;
        
        for (int i = 0; i < customerID.length(); i++) {
            if (!Character.isDigit(customerID.charAt(i)))
                return false;
        }

        return customerID.length() == 14;
    }
    private boolean isValidCustomerBranchCode(int customerBranchCode) {
        return (customerBranchCode > 0 && customerBranchCode < 10);
    }
    
    //accessors
    public String getCustomerName() {
        return this.customerName;
    }
    public String getCustomerID() {
        return this.customerID;
    }
    public int getCustomerBranchCode() {
        return this.customerBranchCode;
    }
    public Object[] getCustomerAccountsList() {
        return customerAccountsList.toArray();
    }
    
    
    //add account method
    public boolean addAccount(Account account) {
        if(findAccount(account.getAccountNo()) == -1) {
            this.customerAccountsList.add(account);
            return true;
        }
        return false;
    }
    //find account method
    public int findAccount(int accountNo) {
        for (int i = 0; i < this.customerAccountsList.size(); i++) {
            if(accountNo == this.customerAccountsList.get(i).getAccountNo())
                return i;
        }
        return -1;
    }
    
    //printing methods
    @Override
    public String toString() {
        String customerDescription = "\n********** Customer Data **********";
        customerDescription += "\nName: " + this.customerName;
        customerDescription += "\nNational ID: " + this.customerID;
        customerDescription += "\nBranch: " + this.customerBranchCode;
        customerDescription += "\nAccounts: ";
        for(Account account : this.customerAccountsList)
            customerDescription += account;
        return customerDescription;
    }
}