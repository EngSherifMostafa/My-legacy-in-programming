import java.util.LinkedList;
import java.util.Queue;

class Request {

    // create variables
    private String requerter;
    private String receiver;
    private double r_amount;
    private boolean request_condition;

    // create objects
    static Queue<Request> queue = new LinkedList<Request>();

    // constructors
    public Request() {

    }

    private Request(String requerter, String receiver, double r_amount, boolean request_condition) {
        this.requerter = requerter;
        this.receiver = receiver;
        this.r_amount = r_amount;
        this.request_condition = request_condition;
    }

    // getters
    public String getRequerter() {
        return requerter;
    }

    public String getReceiver() {
        return receiver;
    }

    public double getR_amount() {
        return r_amount;
    }

    public boolean isRequest_condition() {
        return request_condition;
    }

    // setters
    public void setRequerter(String requerter) {
        this.requerter = requerter;
    }

    public void setReceiver(String receiver) {
        this.receiver = receiver;
    }

    public void setR_amount(double r_amount) {
        this.r_amount = r_amount;
    }

    public void setRequest_condition(boolean request_condition) {
        this.request_condition = request_condition;
    }

    // methods
    public void Add_Request(String requerter, String receiver, double r_amount, boolean request_condition) {
        requerter = requerter.trim().toLowerCase();
        receiver = receiver.trim().toLowerCase();
        Request request = new Request(requerter, receiver, r_amount, request_condition);
        queue.add(request);
    }

    public static Request Find_Request(String requerter_Name, String receiver_Name) {
        requerter_Name = requerter_Name.trim().toLowerCase();
        receiver_Name = receiver_Name.trim().toLowerCase();

        for (Request request : queue) {
            if (request.getRequerter().equals(requerter_Name) && request.getReceiver().equals(receiver_Name))
                return request;
        }
        return null;
    }

    public static void Display_Requests() {
        for (Request request : queue) {
            System.out.print("Requerter: " + request.getRequerter());
            System.out.print("\t\tReceiver: " + request.getReceiver());
            System.out.print("\tRequest Amount: " + request.getR_amount());
            System.out.print("\t\tRequest Condition: " + request.isRequest_condition() + "\n");
        }
    }
}