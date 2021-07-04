package bankmanagementsystem;
import java.util.Arrays;

public class BankManagementSystem {
    public static void main(String[] args) {
        //add banks
        Bank bank1 = new Bank("Misr", 5);
        Bank bank2 = new Bank("CIB", 3);
        
        //add branchs
        Branch branchMisr1 = new Branch(1, "Misr Ismailia", "Soltan Hussen dist.", new Teller("Ahmed", 10));
        Branch branchMisr2 = new Branch(2, "Misr Ismailia", "Mohmmed Ali St.", new Teller("Sayed", 11));
        Branch branchMisr3 = new Branch(3, "Misr Ismailia", "Mostafa Kamel St.", new Teller("Ali", 12));
        Branch branchMisr4 = new Branch(4, "Misr Ismailia", "Taha Hussen St.", new Teller("Gamal", 13));
        Branch branchMisr5 = new Branch(5, "Misr Ismailia", "Balabsa dist.", new Teller("Saad", 14));
        Branch branchCIB1 = new Branch(1, "CIB Ismailia", "El-Salam dist.", new Teller("Mohammed", 13));
        Branch branchCIB2 = new Branch(2, "CIB Ismailia", "El-Mahata dist.", new Teller("Khaled", 14));
        Branch branchCIB3 = new Branch(3, "CIB Ismailia", "SCA dist.", new Teller("Adam", 15));

        //add customers
        Customer customerBranchMisr1 = new Customer("Ahmed", "54545421788484", 1);
        Customer customerBranchMisr2 = new Customer("Mohammed", "54879487484784", 2);
        Customer customerBranchMisr3 = new Customer("Salah", "12345678911111", 3);
        Customer customerBranchMisr4 = new Customer("Osama", "54878485484784", 4);
        Customer customerBranchMisr5 = new Customer("Pola", "12345678911955", 5);
        Customer customerBranchCIB1 = new Customer("Amal", "58478978454544", 1);
        Customer customerBranchCIB2 = new Customer("Fayza", "12365678911111", 2);
        Customer customerBranchCIB3 = new Customer("Koulod", "12398578911111", 3);
        
        /****************************************************************************************************/
        
        //add Branchs to Banks
        bank1.addBranch(branchMisr1);
        bank1.addBranch(branchMisr2);
        bank1.addBranch(branchMisr3);
        bank1.addBranch(branchMisr4);
        bank1.addBranch(branchMisr5);
        bank2.addBranch(branchCIB1);
        bank2.addBranch(branchCIB2);
        bank2.addBranch(branchCIB3);

        //add Accounts to Customers
        customerBranchMisr1.addAccount(new SavingAccount(10000, Currency.EGP, 0.1F, 2000));
        customerBranchMisr2.addAccount(new SavingAccount(15000, Currency.SAR, 0.2f, 5000));
        customerBranchMisr3.addAccount(new SavingAccount(20000, Currency.GBP, 0.3F, 7000));
        customerBranchMisr4.addAccount(new SavingAccount(25000, Currency.USD, 0.2F, 2500));
        customerBranchMisr5.addAccount(new SavingAccount(3000, Currency.EUR, 0.3F, 3700));     
        customerBranchCIB1.addAccount(new SavingAccount(35000, Currency.EUR, 0.1F, 1000));
        customerBranchCIB2.addAccount(new SavingAccount(40000, Currency.GBP, 0.3F, 1500));
        customerBranchCIB3.addAccount(new SavingAccount(45000, Currency.EGP, 0.5F, 8000));  
        customerBranchMisr1.addAccount(new CheckingAccount(1000, Currency.EGP));
        customerBranchMisr2.addAccount(new CheckingAccount(2000, Currency.SAR));
        customerBranchMisr3.addAccount(new CheckingAccount(3000, Currency.GBP));
        customerBranchMisr4.addAccount(new CheckingAccount(4000, Currency.USD));
        customerBranchMisr5.addAccount(new CheckingAccount(5000, Currency.EUR));
        customerBranchCIB1.addAccount(new CheckingAccount(6000, Currency.EUR));
        customerBranchCIB2.addAccount(new CheckingAccount(7000, Currency.EGP));
        customerBranchCIB3.addAccount(new CheckingAccount(8000, Currency.GBP));                                       
        
        /****************************************************************************************************/
        //testing
        
        Customer ahmed = new Customer("Ahmed", "13579753951496", 1);
        Customer mohamed = new Customer("Mohamed", "13570013951496", 2);

        //polymorphism  -  dynamic (late) binding at run-time
        Account ahmedAccount = new CheckingAccount(10000, Currency.EUR);
        //static (early) binding at compile-time
        SavingAccount mohamedAccount = new SavingAccount(10000, Currency.EUR, 0.2F, 3000);
        
        ahmed.addAccount(ahmedAccount);
        mohamed.addAccount(mohamedAccount);
        
        System.out.println(mohamed);
        mohamedAccount.withdrawAmount(3000);
        System.out.println(mohamed);
        mohamedAccount.depositAmount(5000);
        System.out.println(mohamed);
        mohamedAccount.withdrawAmount(2000);
        System.out.println(mohamed);
        mohamedAccount.depositAmount(7000);
        System.out.println(mohamed);
        
        mohamedAccount.setTax(0.5);
        System.out.println(mohamedAccount.getTax());

        mohamedAccount.pay();
        System.out.println(mohamed);
        
        //static method hiding
        System.out.println(ahmedAccount.getAccountSN());
        System.out.println(mohamedAccount.getAccountSN());
        
        /*****************************************************************************/
        
        //Override Comparable interface to use sort method
        Object[] custAccountsArray = customerBranchCIB1.getCustomerAccountsList();
        for(Object account : custAccountsArray)
            System.out.println(account);
        Arrays.sort(custAccountsArray);
        
        for(Object account : custAccountsArray)
            System.out.println(account);
        
        /*****************************************************************************/
    }
}