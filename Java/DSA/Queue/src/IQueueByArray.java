public interface IQueueByArray {
    boolean isEmpty();

    boolean isFull();

    int getSize();

    void push(Object data);

    Object pop();

    Object peek();

    Object find(int key);

    void display();
}
