package bankmanagementsystem;

public class Teller {
    //data field
    private int tellerID;
    private final String tellerName;
    
    //constructors
    public Teller(String tellerName) {
        this(tellerName, 99);
    }
    public Teller(String tellerName, int tellerID) {
        if(!isValidTellerName(tellerName)) {
            System.out.println("Error: Teller Name is Invalid " + tellerName + this.printLine());
            this.tellerName = "";
            this.tellerID = 99;
            return;
        }
        
        if(!isValidTellerID(tellerID)) {
            System.out.println("Error: Teller ID is Invalid " + tellerID + this.printLine());
            this.tellerName = "";
            this.tellerID = 99;
            return;
        }
        
        this.tellerName = tellerName.trim();
        this.tellerID = tellerID;
    }
    
    //checking methods
    private boolean isValidTellerID(int tellerId) {
        return (tellerId > 9 && tellerId < 100);
    }
    private boolean isValidTellerName(String tellerName) {
        tellerName = tellerName.trim();
        if (tellerName.isEmpty())
            return false;
        
        for (int i = 0; i < tellerName.length(); i++) {
            if (!Character.isLetter(tellerName.charAt(i)))
                return false;
        }
        return true;
    }
    
    //accessors
    public String getTellerName() {
        return this.tellerName;
    }
    public int getTellerID() {
        return this.tellerID;
    }
    
    //mutators
    public void setTellerID(int tellerID) {
        if(this.isValidTellerID(tellerID))
            this.tellerID = tellerID;
    }
    
    //printing methods
    private String printLine() {
        return "------------------------------------------------------------------------------------------------------------------------------";
    }
}