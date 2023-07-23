public class QueueByRef<Data> implements IQueueByRef<Data> {
    private Node front;
    private Node<Data> rear;
    private Node current;

    public QueueByRef() {
        front = null;
        rear = null;
        current = null;
    }

    @Override
    public void advance() {
        current = current.next;
    }

    public boolean isEmpty() {
        return (front == null);
    }

    @Override
    public boolean isFull() {
        return false;
    }

    @Override
    public int getSize() {
        return Node.getSize();
    }

    @Override
    public void push(long key, Data data) {
        Node<Data> newNode = new Node<>(key, data);

        if (isEmpty()) {
            front = newNode;
            rear = newNode;
            return;
        }

        rear.next = newNode;
        rear = newNode;
    }

    @Override
    public Node<Data> pop() {
        if (isEmpty())
            return null;
        current = front;
        front = front.next;
        Node.setSize();
        return current;
    }

    @Override
    public Node<Data> find(long key) {
        current = front;
        while (current.getKey() != key && current != null)
            advance();
        return current;
    }

    @Override
    public Node<Data> peek() {
        return front;
    }

    @Override
    public void display() {
        current = front;
        while (current != null) {
            current.traverse();
            advance();
        }
    }

}