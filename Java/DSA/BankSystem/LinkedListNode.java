class LinkedListNode {
    private long key;
    private String strData;
    private static int size = 0;
    public LinkedListNode next;

    //constructors
    public LinkedListNode() {
        next = null;
		size++;
    }

    public LinkedListNode(long key, String strData) {
        this();
        this.key = key;
        this.strData = strData;
    }

    //setters
    public void setKey(long id) {
        this.key = id;
    }

    public void setStrData(String name) {
        this.strData = name;
    }

    public static void setSize() {
        size--;
    }

    //getters
    public long getKey() {
        return this.key;
    }

    public String getStrData() {
        return this.strData;
    }

    public static int getSize() {
        return size;
    }

    public void traverse() {
        System.out.print("Student ID: " + this.getKey());
        System.out.print("\tStudent Name: " + this.getStrData() + "\n");
    }
}