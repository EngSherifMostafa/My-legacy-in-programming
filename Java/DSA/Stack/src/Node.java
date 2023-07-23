class Node {
    private long key;
    private String strData;
    public Node next;
    private static int size;

    public Node() {
        next = null;
        size++;
    }
    public Node(long key, String strData) {
        this();
        this.key = key;
        this.strData = strData;
    }

    //getters
    public long getKey() {
        return key;
    }

    public String getStrData() {
        return strData;
    }

    public static int getSize() {
        return size;
    }

    //setters
    public void setKey(long key) {
        this.key = key;
    }

    public void setStrData(String strData) {
        this.strData = strData;
    }

    public static void setSize() {
        size--;
    }

    public void traverse() {
        System.out.print("Student ID: " + this.getKey());
        System.out.print("\tStudent Name: " + this.getStrData() + "\n");
    }
}
