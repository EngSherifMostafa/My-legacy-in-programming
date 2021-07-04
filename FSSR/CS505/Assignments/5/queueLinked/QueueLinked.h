#ifndef QUEUELIINKED_H
#define QUEUELIINKED_H
#include <cstdlib>

template <class T>
class QueueLinked
{
public:
    //constructor
    QueueLinked();
    //destructor
    ~QueueLinked();

    //methods prototype
    bool isEmpty() const;
    bool isFull() const;
    void getFront(T&) const;
    void enQueue(T);
    void deQueue(T&);
    int queueLength() const;
    void traverse(void(*)(T)) const;

private:
    class Node
    {
    public:
        T data;
        Node *next;
        //constructor
        Node(T sentData):data(sentData),next(NULL){}
    };
    typedef Node* nodePtr;
    nodePtr front,rear,cursor;
    int lengthOfQueue;
};

#endif //QUEUELIINKED_H
