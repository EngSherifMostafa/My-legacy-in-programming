#ifndef LISTLINKED_H
#define LISTLINKED_H
#include <cstdlib>

template <class K,class T>
class List
{
public:
    //constructor to initialize list
    List();
    //destructor to destroy all elements
    ~List();

    //methods prototype
    bool isEmpty() const;
    bool curIsEmpty() const;
    void toFirst();
    bool atFirst() const;
    void advance();
    void toEnd();
    bool atEnd() const;
    int listSize() const;
    void updateData(const T&);
    void retrieveData(K&,T&) const;
    void insertFirst(const K&,const T&);
    void insertAfter(const K&,const T&);
    void insertBefore(const K&,const T&);
    void insertEnd(const K&,const T&);
    void deleteNode();
    void deleteFirst();
    void deleteEnd();
    void makeListEmpty();
    bool searchKey(const K&);
    void orderInsert(const K&,const T&);
    void traverse(void(*)(K,T)) const;

private:
    class Node
    {
    public:
        K key;
        T data;
        Node *next;

		//constructor to set key=sentKey, data=sentData and set pointer to NULL
        Node(K sentKey,T sentData):key(sentKey),data(sentData),next(NULL){}
    };

    //redefine pointer to node
    typedef Node* nodePtr;
    nodePtr head,cursor,prev; //create pointers of type Node
    int sizeOfList;
};
#endif //LISTLINKED_H
