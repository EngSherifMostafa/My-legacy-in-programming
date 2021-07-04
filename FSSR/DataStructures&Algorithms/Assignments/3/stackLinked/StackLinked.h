#ifndef STACKLINKED_H
#define STACKLINKED_H
#include <cstdlib>

template <class T>
class StackLinked
{
public:
    StackLinked(); //constructor
    ~StackLinked(); //destructor
    
	bool isEmpty() const;
    bool isFull() const;
    void getTop(T&) const;
    void push(T);
    void pop(T&);
	int stackSize() const;
    void traverse(void(*)(T)) const;
	
private:
    class Node
    {
    public:
        T data;
        Node *next;
        Node(T sentData):data(sentData),next(NULL){} //constructor
    };
    typedef Node* nodePtr;
    nodePtr top,cursor;
    int sizeOfStack;
};

#endif //STACKLINKED_H