public interface ILinkedList {
    void advance();

    void setRefToHead();

    boolean isEmpty();

    int getSize();

    String find(long key);

    void insert(long key, String strData);

    void delete();

    void deleteByKey(long key);

    void display();
}
