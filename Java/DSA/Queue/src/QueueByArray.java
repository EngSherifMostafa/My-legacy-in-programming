public class QueueByArray implements IQueueByArray {
    private int maxSize, size, front, rear, current;
    private Object[] queueArray;

    public QueueByArray(int maxSize) {
        this.maxSize = maxSize;
        queueArray = new Object[this.maxSize];
        front = 0;
        rear = -1;
        size = 0;
    }

    @Override
    public boolean isEmpty() {
        return (size == 0);
    }

    @Override
    public boolean isFull() {
        return (size == maxSize);
    }

    @Override
    public int getSize() {
        return size;
    }

    @Override
    public void push(Object data) {
        if (isFull())
            return;

        rear = (rear + 1) % maxSize;
        queueArray[rear] = data;
        size++;
    }

    @Override
    public Object pop() {
        if (isEmpty())
            return null;

        Object item = queueArray[front];
        front = (front + 1) % maxSize;
        size--;
        return item;
    }

    @Override
    public Object peek() {
        if (isEmpty())
            return null;
        return queueArray[front];
    }

    @Override
    public Object find(int key) {
        if (isEmpty())
            return null;
        return queueArray[key];
    }
    @Override
    public void display() {
        if (isEmpty())
            return;

        current = front;
        for (int c = 0; c < size; c++) {
            System.out.println(queueArray[current]);
            current = (current + 1) % maxSize;
        }
    }
}
