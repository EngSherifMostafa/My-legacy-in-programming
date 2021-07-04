package bankmanagementsystem;
import java.util.ArrayList;

public class Branch {
    //data field
    private int branchCode;
    private String branchName;
    private String branchAddress;
    private static int createdBranchesCount;
    private final ArrayList<Teller> branchTellersList;

    //constructors
    public Branch() {
        this.branchTellersList = new ArrayList<>();
        Branch.createdBranchesCount++;
    }
    public Branch(int branchCode, String branchName, String branchAddress, Teller branchTeller) {
        this();
        this.setBranchCode(branchCode);
        this.setBranchName(branchName);
        this.setBranchAddress(branchAddress);
        this.addTeller(branchTeller);
    }
    
    //accessors
    public int getBranchCode() {
        return this.branchCode;
    }
    public String getBranchName() {
        return this.branchName;
    }
    public String getBranchAddress() {
        return this.branchAddress;
    }
    public static int getCreatedBranchesCount() {
        return Branch.createdBranchesCount;
    }
    public String getBranchTellersList() {
        String tellers = "";
        for (Teller teller : this.branchTellersList) {
            if(teller == null)
                break;
            
            tellers += "{ ";
            tellers += "Teller ID: " + teller.getTellerID() + " - ";
            tellers += "Teller Name: " + teller.getTellerName() + " }";
        }
        return tellers;
    }

    //mutators
    public void setBranchCode(int branchCode) {
        if (branchCode < 10 && branchCode > 0)
            this.branchCode = branchCode;
        else
            System.out.println("Error: Bank Branches Code is Invalid " + branchCode + this.printLine());
    }
    public void setBranchName(String branchName) {
        if(Character.isLetter(branchName.charAt(0))
                && Character.isLetter(branchName.charAt(1))
                && Character.isLetter(branchName.charAt(2)))
            this.branchName = branchName;
        else
            System.out.println("Error: Bank Branches Name is Invalid " + branchName + this.printLine());
    }
    public void setBranchAddress(String branchAddress) {
        this.branchAddress = branchAddress;
    }

    //add teller method
    public boolean addTeller(Teller teller) {
        if(this.findTeller(teller.getTellerID()) == -1) {
            this.branchTellersList.add(teller);
            return true;
        }
        return false;
    }
    //remove teller method
    public boolean removeTeller(int tellerID) {
        if(this.findTeller(tellerID) > -1) {
            this.branchTellersList.remove(tellerID);
            return true;
        }
        return false;
    }
    //find teller method
    public int findTeller(int tellerID) {
        for (int i = 0; i < this.branchTellersList.size(); i++) {
            if(tellerID == this.branchTellersList.get(i).getTellerID())
                return i;
        }
        return -1;
    }
    
    //printing methods
    private String printLine() {
        return "------------------------------------------------------------------------------------------------------------------------------";
    }
}