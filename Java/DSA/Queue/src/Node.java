public class Node<Data> {
    private long key;
    private Data data;
    public Node next;
    private static int size = 0;

    public Node() {
        next = null;
        size++;
    }

    public Node(long key, Data data) {
        this();
        this.key = key;
        this.data = data;
    }

    //setters
    public void setKey(long key) {
        this.key = key;
    }

    public void setData(Data data) {
        this.data = data;
    }

    public static void setSize() {
        size--;
    }

    //getters
    public long getKey() {
        return key;
    }

    public Data getData() {
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
