/*
Data Structures Utilized: 
• Linked List: Manage client profiles and transaction records efficiently. 
• Stack: Implement undo functionality to revert the last transaction. 
• Queue: Handle and organize transaction requests.  
 */

class Client_Operations {

    // create objects
    private Transaction transaction = new Transaction();
    private Request request = new Request();

    // Enable clients to deposit funds into their accounts.
    public boolean Deposit(long client_ID, double d_amount) {
        Math.abs(d_amount);
        Client client = Client.Find_Client(client_ID);

        if (client != null) {
            client.setClient_balance(+d_amount);
            transaction.Add_Transaction(d_amount, "Deposit", true, client);
            return true;
        }
        transaction.Add_Transaction(d_amount, "Deposit", false, client);
        return false;
    }

    // Enable clients to deposit funds into their accounts.
    public boolean Deposit(String client_Name, double d_amount) {
        Math.abs(d_amount);
        Client client = Client.Find_Client(client_Name);

        if (client != null) {
            client.setClient_balance(+d_amount);
            transaction.Add_Transaction(d_amount, "Deposit", true, client);
            return true;
        }
        transaction.Add_Transaction(d_amount, "Deposit", false, client);
        return false;
    }

    // Allow clients to withdraw funds from their accounts.
    public boolean Withdraw(long client_ID, double w_amount) {
        Math.abs(w_amount);
        Client client = Client.Find_Client(client_ID);

        if (client != null && Client.Check_Amount(client, w_amount)) {
            client.setClient_balance(-w_amount);
            transaction.Add_Transaction(w_amount, "Withdraw", true, client);
            return true;
        }
        transaction.Add_Transaction(w_amount, "Withdraw", false, client);
        return false;
    }

    // Allow clients to withdraw funds from their accounts.
    public boolean Withdraw(String client_Name, double w_amount) {
        Math.abs(w_amount);
        Client client = Client.Find_Client(client_Name);

        if (client != null && Client.Check_Amount(client, w_amount)) {
            client.setClient_balance(-w_amount);
            transaction.Add_Transaction(w_amount, "Withdraw", true, client);
            return true;
        }
        transaction.Add_Transaction(w_amount, "Withdraw", false, client);
        return false;
    }

    // Facilitate credit transfers between clients.
    public boolean Transfer_Credit(long sender, long receiver, double t_amount) {
        Math.abs(t_amount);
        Client sender_client = Client.Find_Client(sender);
        Client receiver_client = Client.Find_Client(receiver);

        if (sender_client != null && receiver_client != null && Client.Check_Amount(sender_client, t_amount)) {
            sender_client.setClient_balance(-t_amount);
            receiver_client.setClient_balance(t_amount);
            transaction.Add_Transaction(-t_amount, "Transfer_Credit", true, sender_client);
            transaction.Add_Transaction(t_amount, "Transfer_Credit", true, receiver_client);
            return true;
        }
        transaction.Add_Transaction(-t_amount, "Transfer_Credit", false, sender_client);
        transaction.Add_Transaction(t_amount, "Transfer_Credit", false, receiver_client);
        return false;
    }

    // Facilitate credit transfers between clients.
    public boolean Transfer_Credit(long sender, String receiver, double t_amount) {
        Math.abs(t_amount);
        Client sender_client = Client.Find_Client(sender);
        Client receiver_client = Client.Find_Client(receiver);

        if (sender_client != null && receiver_client != null && Client.Check_Amount(sender_client, t_amount)) {
            sender_client.setClient_balance(-t_amount);
            receiver_client.setClient_balance(t_amount);
            transaction.Add_Transaction(-t_amount, "Transfer_Credit", true, sender_client);
            transaction.Add_Transaction(t_amount, "Transfer_Credit", true, receiver_client);
            return true;
        }
        transaction.Add_Transaction(-t_amount, "Transfer_Credit", false, sender_client);
        transaction.Add_Transaction(t_amount, "Transfer_Credit", false, receiver_client);
        return false;
    }

    // Facilitate credit transfers between clients.
    public boolean Transfer_Credit(String sender, long receiver, double t_amount) {
        Math.abs(t_amount);
        Client sender_client = Client.Find_Client(sender);
        Client receiver_client = Client.Find_Client(receiver);

        if (sender_client != null && receiver_client != null && Client.Check_Amount(sender_client, t_amount)) {
            sender_client.setClient_balance(-t_amount);
            receiver_client.setClient_balance(t_amount);
            transaction.Add_Transaction(-t_amount, "Transfer_Credit", true, sender_client);
            transaction.Add_Transaction(t_amount, "Transfer_Credit", true, receiver_client);
            return true;
        }
        transaction.Add_Transaction(-t_amount, "Transfer_Credit", false, sender_client);
        transaction.Add_Transaction(t_amount, "Transfer_Credit", false, receiver_client);
        return false;
    }

    // Facilitate credit transfers between clients.
    public boolean Transfer_Credit(String sender, String receiver, double t_amount) {
        Math.abs(t_amount);
        Client sender_client = Client.Find_Client(sender);
        Client receiver_client = Client.Find_Client(receiver);

        if (sender_client != null && receiver_client != null && Client.Check_Amount(sender_client, t_amount)) {
            sender_client.setClient_balance(-t_amount);
            receiver_client.setClient_balance(t_amount);
            transaction.Add_Transaction(-t_amount, "Transfer_Credit", true, sender_client);
            transaction.Add_Transaction(t_amount, "Transfer_Credit", true, receiver_client);
            return true;
        }
        transaction.Add_Transaction(-t_amount, "Transfer_Credit", false, sender_client);
        transaction.Add_Transaction(t_amount, "Transfer_Credit", false, receiver_client);
        return false;
    }

    // Permit clients to request funds from others.
    public boolean Request_Money(String requerter_Name, String receiver_Name, double r_amount) {
        Math.abs(r_amount);
        Client requerter_client = Client.Find_Client(requerter_Name);
        Client receiver_client = Client.Find_Client(receiver_Name);

        if (requerter_client != null && receiver_client != null && Client.Check_Amount(receiver_client, r_amount)) {
            request.Add_Request(requerter_client.getClient_Name(), receiver_client.getClient_Name(), r_amount, false);
            return true;
        }
        return false;
    }

    // Permit clients to request funds from others.
    public boolean Request_Money(long requerter_ID, String receiver_Name, double r_amount) {
        Math.abs(r_amount);
        Client requerter_client = Client.Find_Client(requerter_ID);
        Client receiver_client = Client.Find_Client(receiver_Name);

        if (requerter_client != null && receiver_client != null && Client.Check_Amount(receiver_client, r_amount)) {
            request.Add_Request(requerter_client.getClient_Name(), receiver_client.getClient_Name(), r_amount, false);
            return true;
        }
        return false;
    }

    // Permit clients to request funds from others.
    public boolean Request_Money(String requerter_Name, long receiver_ID, double r_amount) {
        Math.abs(r_amount);
        Client requerter_client = Client.Find_Client(requerter_Name);
        Client receiver_client = Client.Find_Client(receiver_ID);

        if (requerter_client != null && receiver_client != null && Client.Check_Amount(receiver_client, r_amount)) {
            request.Add_Request(requerter_client.getClient_Name(), receiver_client.getClient_Name(), r_amount, false);
            return true;
        }
        return false;
    }

    // Permit clients to request funds from others.
    public boolean Request_Money(long requerter_ID, long receiver_ID, double r_amount) {
        Math.abs(r_amount);
        Client requerter_client = Client.Find_Client(requerter_ID);
        Client receiver_client = Client.Find_Client(receiver_ID);

        if (requerter_client != null && receiver_client != null && Client.Check_Amount(receiver_client, r_amount)) {
            request.Add_Request(requerter_client.getClient_Name(), receiver_client.getClient_Name(), r_amount, false);
            return true;
        }
        return false;
    }

    // Allow clients to accept or decline money requests.
    public void Accept_Requests(String requerter_Name, String receiver_Name, boolean request_condition) {
        Request request = Request.Find_Request(requerter_Name, receiver_Name);
        if (request != null) {
            request.setRequest_condition(request_condition);

            if (request_condition == true) {
                Deposit(request.getRequerter(), request.getR_amount());
                Withdraw(request.getReceiver(), request.getR_amount());
            }
        }
    }

    // Display a list of transactions in reverse chronological order.
    public void Show_Transactions() {
        Transaction.Display_Transaction();
    }

    // List money requests in chronological order.
    public void Show_Requests() {
        System.out.println("********* Requests *********");
        Request.Display_Requests();
        System.out.println("********* ********* ********* ********* *********");
    }

    // Implement functionality to revert the most recent transaction.
    public Transaction Undo_Last_Transaction() {
        return Transaction.Remove_Last_Transaction();
    }
}