#include "QueueLinked.h"

//constructor
template <class T>
QueueLinked<T>::QueueLinked()
{
    front=NULL; rear=NULL; cursor=NULL; lengthOfQueue=0;
}

//destructor
template <class T>
QueueLinked<T>::~QueueLinked()
{
    while(front!=NULL)
    {
        cursor=front;
        front=front->next;
        delete cursor;
    }
    cursor=NULL;
    lengthOfQueue=0;
}

//return true if structure empty
template <class T>
bool QueueLinked<T>::isEmpty() const
{
    return !lengthOfQueue;
}

//return true if structure full
template <class T>
bool QueueLinked<T>::isFull() const
{
    return 0;
}

//get top element without changing structure
template <class T>
void QueueLinked<T>::getFront(T &ele) const
{
    if(isEmpty()) return;
    ele=front->data;
}

//put element in structure
template <class T>
void QueueLinked<T>::enQueue(T ele)
{
    nodePtr newNode=new Node(ele);
    if(isEmpty())
    {
        rear=newNode;
        front=newNode;
    }
    else
    {
        rear->next=newNode;
        rear=newNode;
    }
    lengthOfQueue++;
}

//get element from structure
template <class T>
void QueueLinked<T>::deQueue(T &ele)
{
    if(isEmpty()) return;
    ele=front->data;
    cursor=front;
    front=front->next;
    delete cursor;
    lengthOfQueue--;
}

//return size of structure
template <class T>
int QueueLinked<T>::queueLength() const
{
    return lengthOfQueue;
}

//traverse elements in structure
template <class T>
void QueueLinked<T>::traverse(void(*pf)(T)) const
{
    if(isEmpty()) return;
    nodePtr tempNode=front;
    while(tempNode!=NULL)
    {
        (*pf)(tempNode->data);
        tempNode=tempNode->next;
    }
}
