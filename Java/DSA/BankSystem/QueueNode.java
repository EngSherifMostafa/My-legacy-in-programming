public class QueueNode{
    private long key;
    private String data;
    public QueueNode next;
    private static int size = 0;

    public QueueNode() {
        next = null;
        size++;
    }

    public QueueNode(long key, String data) {
        this();
        this.key = key;
        this.data = data;
    }

    //setters
    public void setKey(long key) {
        this.key = key;
    }

    public void setData(String data) {
        this.data = data;
    }

    public static void setSize() {
        size--;
    }

    //getters
    public long getKey() {
        return key;
    }

    public String getData() {
        return data;
    }

    public static int getSize() {
        return size;
    }

    public void traverse() {
        System.out.print("Key: " + this.getKey());
        System.out.print("\tData: " + this.getData() + "\n");
    }
}