public interface IQueueByRef<Data> {
    void advance();

    boolean isEmpty();

    boolean isFull();

    int getSize();

    Node<Data> find(long key);

    void push(long key, Data data);

    Node<Data> pop();

    Node<Data> peek();

    void display();
}
