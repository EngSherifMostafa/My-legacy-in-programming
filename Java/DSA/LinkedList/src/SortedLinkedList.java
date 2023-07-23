class SortedLinkedList implements ILinkedList{
    private Node head, current, previous;

    public SortedLinkedList() {
        head = null;
        current = null;
        previous = null;
    }

    @Override
    public void advance() {
        previous = current;
        current = current.next;
    }

    @Override
    public void setRefToHead() {
        previous = head;
        current = head;
    }

    @Override
    public boolean isEmpty() {
        return (head == null);
    }

    @Override
    public int getSize() {
        return Node.getSize();
    }

    @Override
    public String find(long key) {
        setRefToHead();
        while (current != null) {
            if (current.getKey() == key)
                return current.getStrData();
            advance();
        }
        return "";
    }

    @Override
    public void insert(long key, String strData) {
        Node newNode = new Node(key, strData);

        //insert the first element
        if (isEmpty()) {
            head = newNode;
            return;
        }

        int counter = 0;
        setRefToHead();
        while (current != null && current.getKey() < key) {
            advance();
            counter++;
        }

        //insert at first
        if (counter == 0) {
            head = newNode;
            newNode.next = current;
            return;
        }

        //insert at middle
        newNode.next = current;
        previous.next = newNode;
    }

    @Override
    public void delete() {
        head = head.next;
        Node.setSize();
    }

    @Override
    public void deleteByKey(long key) {
        int counter = 0;
        setRefToHead();
        while (current.getKey() != key) {
            advance();
            counter++;
        }

        //delete first element
        if (counter == 0) {
            head = current.next;
            Node.setSize();
            return;
        }
        //delete middle element
        previous.next = current.next;
        Node.setSize();
    }

    @Override
    public void display() {
        current = head;
        while (current != null) {
            current.traverse();
            current = current.next;
        }
    }
}