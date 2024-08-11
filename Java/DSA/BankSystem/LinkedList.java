
class LinkedList{
    LinkedListNode head, current, previous;

    LinkedList() {
        head = null;
        current = null;
        previous = null;
    }

    public void advance() {
        previous = current;
        current = current.next;
    }

    public void setRefToHead() {
        previous = head;
        current = head;
    }

    public boolean isEmpty() {
        return (head == null);
    }

    public int getSize() {
        return LinkedListNode.getSize();
    }

    public String find(long key) {
        setRefToHead();
        while (current != null) {
            if (current.getKey() == key)
                return current.getStrData();
            advance();
        }
        return "";
    }

    public void insert(long key, String strData) {
        LinkedListNode newNode = new LinkedListNode(key, strData);
        newNode.next = head;
        head = newNode;
    }

    public void delete() {
        head = head.next;
        LinkedListNode.setSize();
    }

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
            LinkedListNode.setSize();
            return;
        }
        //delete middle element
        previous.next = current.next;
        LinkedListNode.setSize();
    }

    public void display() {
        current = head;
        while (current != null) {
            current.traverse();
            current = current.next;
        }
    }
}
