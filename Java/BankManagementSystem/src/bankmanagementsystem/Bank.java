package bankmanagementsystem;

public class Bank {
    //data field
    private String bankName;
    private int bankBranchesCount;
    private Branch[] bankBranchesList;
    private int branchAdded;

    //constructors
    public Bank(String bankName) {
        this(bankName, 3);
    }
    public Bank(String bankName, int bankBranchesCount) {
        if (!isValidName(bankName)) {
            System.out.println("Error: Bank Name is Invalid " + bankName + this.printLine());
            return;
        }
        
        if (!isValidBranchesCount(bankBranchesCount)) {
            System.out.println("Error: Bank Branches Count is Invalid " + bankBranchesCount + this.printLine());
            return;
        }
        
        this.bankName = bankName.trim();
        this.bankBranchesCount = bankBranchesCount;
        this.bankBranchesList = new Branch[bankBranchesCount];
    }

    //checking methods
    private boolean isValidName(String bankName) {
        bankName = bankName.trim();
        if (bankName.length() < 3)
            return false;
        
        for (int i = 0; i < bankName.length(); i++) {
            if (!Character.isLetter(bankName.charAt(i))) {
                return false;
            }
        }
        return true;
    }
    private boolean isValidBranchesCount(int branchesCount) {
        return branchesCount >= 3;
    }

    //accessors
    public String getBankName() {
        return this.bankName;
    }
    public int getBankBranchesCount() {
        return this.bankBranchesCount;
    }
    public String getBankBranchesList() {
        String branches = "";
        for (Branch branch : bankBranchesList) {
            if(branch == null)
                break;
            
            branches += "{ ";
            branches += "Branch Code: " + branch.getBranchCode() + " - ";
            branches += "Branch Name: " + branch.getBranchName() + " - ";
            branches += "Branch Address: " + branch.getBranchAddress() + " - ";
            branches += branch.getBranchTellersList() + " }\n";
        }
        return branches;
    }

    //add Branch
    public boolean addBranch(Branch branch) {
        if(bankBranchesList.length == branchAdded)
            return false;
        
        this.bankBranchesList[branchAdded++] = branch;
        return true;
    }
    
    //printing methods
    public void printBankInfo(String objName) {
        System.out.println(objName + " Info\n"
                + "Bank Name: " + this.getBankName() + "\n"
                + "Bank Branches Count: " + this.getBankBranchesCount() + "\n"
                + "Bank Branches List: \n" + this.getBankBranchesList()
                + printLine());
    }
    private String printLine() {
        return "------------------------------------------------------------------------------------------------------------------------------";
    }
}