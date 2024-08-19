import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        // create objects
        Administrative_Functions administrative_functions = new Administrative_Functions();
        Client_Operations client_operations = new Client_Operations();

        // variables
        boolean condition = true, acceptance_condition = false;
        int password = 0;
        long client_id = 0;
        double amount = 0.0, client_initial_balance = 0.0, new_client_balance = 0.0;
        String client = null, clinet_name = null, sender_client = null, receiver_client = null;
        Scanner scanner = new Scanner(System.in);

        try {
            while (condition) {
                System.out.println("\n*************************************\n");
                System.out.println("Select the Opertaion: ");
                System.out.println("1- Deposit");
                System.out.println("2- Withdraw");
                System.out.println("3- Transfer Credit");
                System.out.println("4- Request Money");
                System.out.println("5- Accept Requests");
                System.out.println("6- Show Transactions");
                System.out.println("7- Show Requests");
                System.out.println("8- Undo Last Transaction");
                System.out.println("9- (ADMIN) Add Client");
                System.out.println("10- (ADMIN) Remove Client");
                System.out.println("11- (ADMIN) Edit Client Info");
                System.out.println("12- (ADMIN) Show All Clients");
                System.out.println("13- (ADMIN) Show All Transactions");
                System.out.println("14- Exit");
                System.out.println("\n*************************************\n");
                System.out.print("Enter Choice: ");
                int choice = scanner.nextInt();

                switch (choice) {
                    // Client Operations
                    // 1- Deposit
                    case 1:
                        System.out.println("*** Deposit ***");
                        System.out.print("Enter Client's ID or Name: ");
                        client = scanner.next();
                        System.out.print("Enter amount: ");
                        amount = scanner.nextDouble();

                        if (Get_Type(client) == "String")
                            client_operations.Deposit(client, amount);

                        else if (Get_Type(client) == "Long")
                            client_operations.Deposit(Long.parseLong(client), amount);

                        else
                            System.out.println("Error Input !");
                        break;
                    // ***************************************************************************************************************
                    // 2- Withdraw
                    case 2:
                        System.out.println("*** Withdraw ***");
                        System.out.print("Enter Client ID or Client Name: ");
                        client = scanner.next();
                        System.out.print("Enter amount: ");
                        amount = scanner.nextDouble();

                        if (Get_Type(client) == "String")
                            client_operations.Withdraw(client, amount);

                        else if (Get_Type(client) == "Long")
                            client_operations.Withdraw(Long.parseLong(client), amount);

                        else
                            System.out.println("Error Input !");
                        break;
                    // ***************************************************************************************************************
                    // 3- Transfer Credit
                    case 3:
                        System.out.println("*** Transfer Credit ***");
                        System.out.print("Enter Sender Client's ID or Name: ");
                        sender_client = scanner.next();
                        System.out.print("Enter Receiver Client's ID or Name: ");
                        receiver_client = scanner.next();
                        System.out.print("Enter amount: ");
                        amount = scanner.nextDouble();

                        if (Get_Type(sender_client) == "String" && Get_Type(receiver_client) == "String")
                            client_operations.Transfer_Credit(sender_client, receiver_client, amount);

                        else if (Get_Type(sender_client) == "Long" && Get_Type(receiver_client) == "String")
                            client_operations.Transfer_Credit(Long.parseLong(sender_client), receiver_client, amount);

                        else if (Get_Type(sender_client) == "String" && Get_Type(receiver_client) == "Long")
                            client_operations.Transfer_Credit(sender_client, Long.parseLong(receiver_client), amount);

                        else if (Get_Type(sender_client) == "Long" && Get_Type(receiver_client) == "Long")
                            client_operations.Transfer_Credit(Long.parseLong(sender_client),
                                    Long.parseLong(receiver_client), amount);

                        else
                            System.out.println("Error Input !");

                        break;
                    // ***************************************************************************************************************
                    // 4- Request Money
                    case 4:
                        System.out.println("*** Request Money ***");
                        System.out.print("Enter Sender Client's ID or Name: ");
                        sender_client = scanner.next();
                        System.out.print("Enter Receiver Client's ID or Name: ");
                        receiver_client = scanner.next();
                        System.out.print("Enter amount: ");
                        amount = scanner.nextDouble();

                        if (Get_Type(sender_client) == "String" && Get_Type(receiver_client) == "String")
                            client_operations.Request_Money(sender_client, receiver_client, amount);

                        else if (Get_Type(sender_client) == "Long" && Get_Type(receiver_client) == "String")
                            client_operations.Request_Money(Long.parseLong(sender_client), receiver_client, amount);

                        else if (Get_Type(sender_client) == "String" && Get_Type(receiver_client) == "Long")
                            client_operations.Request_Money(sender_client, Long.parseLong(receiver_client), amount);

                        else if (Get_Type(sender_client) == "Long" && Get_Type(receiver_client) == "Long")
                            client_operations.Request_Money(Long.parseLong(sender_client),
                                    Long.parseLong(receiver_client), amount);

                        else
                            System.out.println("Error Input !");
                        break;
                    // ***************************************************************************************************************
                    // 5- Accept Requests
                    case 5:
                        System.out.println("*** Accept Requests ***");
                        System.out.print("Enter Sender Client Name: ");
                        sender_client = scanner.next();
                        System.out.print("Enter Receiver Client Name: ");
                        receiver_client = scanner.next();
                        System.out.print("Enter acceptance condition true / false: ");

                        try {
                            acceptance_condition = scanner.nextBoolean();
                        } catch (Exception e) {
                            System.out.println("Error Input !");
                            break;
                        }

                        if (Get_Type(sender_client) == "String" && Get_Type(receiver_client) == "String")
                            client_operations.Accept_Requests(sender_client, receiver_client, acceptance_condition);

                        else
                            System.out.println("Error Input !");
                        break;
                    // ***************************************************************************************************************
                    // 6- Show Transactions
                    case 6:
                        System.out.println("*** Show Transactions ***");
                        client_operations.Show_Transactions();
                        break;
                    // ***************************************************************************************************************
                    // 7- Show Requests
                    case 7:
                        System.out.println("*** Show Requests ***");
                        client_operations.Show_Requests();
                        break;
                    // ***************************************************************************************************************
                    // 8- Undo Last Transaction
                    case 8:
                        System.out.println("*** Undo Last Transaction ***");
                        client_operations.Undo_Last_Transaction();
                        break;
                    // ***************************************************************************************************************

                    // Administrative Functions
                    // 9- (ADMIN) Add Client
                    case 9:
                        System.out.println("*** (ADMIN) Add Client ***");
                        System.out.print("Enter Admin Password: ");
                        password = scanner.nextInt();
                        if (Check_Password(password)) {
                            System.out.print("Enter Client Name: ");
                            clinet_name = scanner.next();
                            System.out.print("Enter Client's initial Balance: ");
                            client_initial_balance = scanner.nextDouble();
                            administrative_functions.Add_Client(clinet_name, client_initial_balance);
                        } else
                            System.out.println("Incorrect Password");
                        break;
                    // ***************************************************************************************************************
                    // 10- (ADMIN) Remove Client
                    case 10:
                        System.out.println("*** (ADMIN) Remove Client ***");
                        System.out.print("Enter Admin Password: ");
                        password = scanner.nextInt();
                        if (Check_Password(password)) {
                            System.out.print("Enter Client ID or Client Name: ");
                            client = scanner.next();
                            try {
                                client_id = Long.parseLong(client);
                                administrative_functions.Remove_Client(client_id);

                            } catch (Exception e) {
                                administrative_functions.Remove_Client(client);
                            }
                        } else
                            System.out.println("Incorrect Password");
                        break;
                    // ***************************************************************************************************************
                    // 11- (ADMIN) Edit Client Info
                    case 11:
                        System.out.println("*** (ADMIN) Edit Client Info ***");
                        System.out.print("Enter Admin Password: ");
                        password = scanner.nextInt();
                        if (Check_Password(password)) {
                            System.out.print("Enter Client ID: ");
                            client_id = scanner.nextLong();
                            System.out.print("Enter Client New Name: ");
                            clinet_name = scanner.next();
                            System.out.print("Enter Client New Balance: ");
                            new_client_balance = scanner.nextDouble();
                            administrative_functions.Edit_Client_Info(client_id, clinet_name, new_client_balance);
                        } else
                            System.out.println("Incorrect Password");
                        break;
                    // ***************************************************************************************************************
                    // 12- (ADMIN) Show All Clients
                    case 12:
                        System.out.println("*** (ADMIN) Show All Clients ***");
                        System.out.print("Enter Admin Password: ");
                        password = scanner.nextInt();
                        if (Check_Password(password)) {
                            administrative_functions.Show_All_Clients();
                        } else
                            System.out.println("Incorrect Password");
                        break;
                    // ***************************************************************************************************************
                    // 13- (ADMIN) Show All Transactions
                    case 13:
                        System.out.println("*** (ADMIN) Show All Transactions ***");
                        System.out.print("Enter Admin Password: ");
                        password = scanner.nextInt();
                        if (Check_Password(password)) {
                            administrative_functions.Show_All_Transactions();
                        } else
                            System.out.println("Incorrect Password");
                        break;
                    // ***************************************************************************************************************
                    // Exit
                    case 14:
                        System.out.println("*** Exit ***");
                        condition = false;
                        break;
                    // ***************************************************************************************************************
                    default:
                        break;
                }
            }
        } catch (Exception e) {
            System.out.println("Error! " + e.toString());
        }
        scanner.close();
    }

    static boolean Check_Password(int password) {
        return (password == 123456);
    }


    // polymorphism
    static String Get_Type(Object obj) {
        if (obj instanceof Long)
            return "Long";
        else if (obj instanceof String)
            return "String";
        return null;
    }
}