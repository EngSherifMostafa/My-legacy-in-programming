public interface IStackByRef {
    void advance();

    boolean isEmpty();

    int getSize();

    String find(long key);

    void push(long key, String strData);

    Node pop();

    Node peek();

    void display();
}
