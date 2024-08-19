import java.util.Stack;
import java.time.LocalDateTime;

class Transaction {

    // create variables
    private LocalDateTime transaction_date;
    private double transaction_amount;
    private String transaction_type;
    private boolean transaction_condition;

    // create objects
    private Client client = new Client();
    private static Stack<Transaction> stack = new Stack<Transaction>();

    // constructors
    public Transaction() {

    }

    private Transaction(double transaction_amount, String transaction_type, boolean transaction_condition,
            Client client) {
        this.transaction_date = LocalDateTime.now();
        this.transaction_amount = transaction_amount;
        this.transaction_type = transaction_type;
        this.transaction_condition = transaction_condition;
        this.client = client;
    }

    // getters
    public LocalDateTime getTransaction_date() {
        return transaction_date;
    }

    public double getTransaction_amount() {
        return transaction_amount;
    }

    public String getTransaction_type() {
        return transaction_type;
    }

    public boolean isTransaction_condition() {
        return transaction_condition;
    }

    public Client getClient() {
        return client;
    }

    // setters
    public void setTransaction_amount(double transaction_amount) {
        this.transaction_amount = transaction_amount;
    }

    // methods
    public void Add_Transaction(double transaction_amount, String transaction_type, boolean transaction_condition,
            Client client) {
        if (client == null)
            client = new Client();
        Transaction transaction = new Transaction(transaction_amount, transaction_type, transaction_condition, client);
        stack.add(transaction);
    }

    public static Transaction Remove_Last_Transaction() {
        if (stack.isEmpty())
            return null;
        else {
            Transaction last_transaction = stack.pop();
            return last_transaction;
        }
    }

    public static void Remove_Transaction(Client client) {
        Stack<Transaction> temp_stack = new Stack<Transaction>();

        // add all transactions except for client who removed to temp_stack
        for (Transaction transaction : stack) {
            if (transaction.getClient().getClient_ID() != client.getClient_ID())
                temp_stack.push(transaction);
        }

        // add all transactions to stack from temp_stack
        for (Transaction transaction : temp_stack) {
            stack.push(transaction);
        }
    }

    public static void Display_Transaction() {
        for (Transaction transaction : stack) {
            System.out.print("Transaction Date: " + transaction.getTransaction_date());
            System.out.print("\tTransaction Amount: " + transaction.getTransaction_amount());
            System.out.print("\tTransaction Type: " + transaction.getTransaction_type());
            System.out.print("\tTransaction Condition: " + transaction.isTransaction_condition());
            System.out.print("\tClinet ID: " + transaction.client.getClient_ID());
            System.out.print("\tClinet Name: " + transaction.client.getClient_Name());
            System.out.print("\tClinet Balance: " + transaction.client.getClient_balance() + "\n");
        }
    }
}