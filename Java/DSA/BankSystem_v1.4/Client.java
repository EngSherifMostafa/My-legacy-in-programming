import java.util.LinkedList;

class Client {

    // create variables
    private static Long Gen_ID = 111111l;
    private long client_ID;
    private String client_Name;
    private double client_balance;

    // create objects
    static LinkedList<Client> linkedlist = new LinkedList<Client>();

    // constructors
    Client() {

    }

    Client(String client_Name, double client_balance) {
        this.client_ID = Gen_ID++;
        this.client_Name = client_Name;
        this.client_balance = client_balance;
    }

    // setter
    public void setClient_ID(long client_ID) {
        this.client_ID = client_ID;
    }

    void setClient_Name(String client_Name) {
        this.client_Name = client_Name;
    }

    void setClient_balance(double client_balance) {
        this.client_balance += client_balance;
    }

    // getters
    Long getClient_ID() {
        return this.client_ID;
    }

    String getClient_Name() {
        return this.client_Name;
    }

    double getClient_balance() {
        return this.client_balance;
    }

    // methods
    static Client Find_Client(long client_ID) {
        for (Client client : linkedlist) {
            if (client.client_ID == client_ID)
                return client;
        }
        return null;
    }

    static Client Find_Client(String client_Name) {
        client_Name = client_Name.trim().toLowerCase();

        for (Client client : linkedlist) {
            if (client.client_Name.equals(client_Name))
                return client;
        }
        return null;
    }

    // check client balance ( return true if client balance is greater than amount )
    static boolean Check_Amount(Client client, double amount) {
        return client.getClient_balance() > amount;
    }

    static void Display_Clients() {
        for (Client client : linkedlist) {
            System.out.print("Clinet ID: " + client.getClient_ID());
            System.out.print("\tClinet Name: " + client.getClient_Name());
            System.out.print("\tClinet Balance: " + client.getClient_balance() + "\n");
        }
    }

    public static void setLinkedlist(LinkedList<Client> linkedlist) {
        Client.linkedlist = linkedlist;
    }
}