/*
Data Structures Utilized: 
• Linked List: Manage client profiles and transaction records efficiently. 
• Stack: Implement undo functionality to revert the last transaction. 
• Queue: Handle and organize transaction requests.  
 */

class Administrative_Functions extends Client {

    // Admins can add new client profiles.
    void Add_Client(String client_Name, double client_balance) {
        client_Name = client_Name.trim().toLowerCase();

        Client client = new Client(client_Name, client_balance);
        linkedlist.add(client);
    }

    // Admins can delete existing client profiles.
    boolean Remove_Client(long client_ID) {
        Client remove_client = Find_Client(client_ID);

        if (remove_client != null) {
            linkedlist.remove(remove_client);
            Transaction.Remove_Transaction(remove_client);
            return true;
        }
        return false;
    }

    // Admins can delete existing client profiles.
    boolean Remove_Client(String client_Name) {
        Client remove_client = Find_Client(client_Name);

        if (remove_client != null) {
            linkedlist.remove(remove_client);
            Transaction.Remove_Transaction(remove_client);
            return true;
        }
        return false;
    }

    // Admins can modify client details.
    boolean Edit_Client_Info(Long client_ID, String new_client_Name, double new_client_balance) {
        Client edit_client = Find_Client(client_ID);

        if (edit_client != null) {
            edit_client.setClient_Name(new_client_Name);
            edit_client.setClient_balance(new_client_balance);
            return true;
        }
        return false;
    }

    // Admins can view detailed information of all clients.
    void Show_All_Clients() {
        System.out.println("********* Clients *********");
        Display_Clients();
        System.out.println("********* ********* ********* ********* *********");
    }

    // Admins can access transaction histories across all clients.
    void Show_All_Transactions() {
        System.out.println("********* Transactions *********");
        Transaction.Display_Transaction();
        System.out.println("********* ********* ********* ********* *********");
    }
}