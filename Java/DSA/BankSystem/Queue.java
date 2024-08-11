public class Queue {
    private QueueNode front;
    private QueueNode rear;
    private QueueNode current;

    public Queue() {
        front = null;
        rear = null;
        current = null;
    }

    public void advance() {
        current = current.next;
    }

    public boolean isEmpty() {
        return (front == null);
    }

    public boolean isFull() {
        return false;
    }

    public int getSize() {
        return QueueNode.getSize();
    }

    public void push(long key, String data) {
        QueueNode newNode = new QueueNode(key, data);

        if (isEmpty()) {
            front = newNode;
            rear = newNode;
            return;
        }

        rear.next = newNode;
        rear = newNode;
    }

    public QueueNode pop() {
        if (isEmpty())
            return null;
        current = front;
        front = front.next;
        QueueNode.setSize();
        return current;
    }

    public QueueNode find(long key) {
        current = front;
        while (current.getKey() != key && current != null)
            advance();
        return current;
    }

    public QueueNode peek() {
        return front;
    }

    public void display() {
        current = front;
        while (current != null) {
            current.traverse();
            advance();
        }
    }

}