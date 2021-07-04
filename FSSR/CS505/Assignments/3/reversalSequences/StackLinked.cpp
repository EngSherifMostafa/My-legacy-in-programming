#include "StackLinked.h"

//constructor
template <class T>
StackLinked<T>::StackLinked()
{
	top=NULL; cursor=NULL; sizeOfStack=0;
}

//destructor
template <class T>
StackLinked<T>::~StackLinked()
{
	while(top!=NULL)
	{
		cursor=top;
		top=top->next;
		delete cursor;
	}
	cursor=NULL;
	sizeOfStack=0;
}

//return true if stack empty
template <class T>
bool StackLinked<T>::isEmpty() const
{
    return !sizeOfStack;
}

//return true if stack full
template <class T>
bool StackLinked<T>::isFull() const
{
    return 0;
}

//get top element without changing stack
template <class T>
void StackLinked<T>::getTop(T &ele) const
{
    if(isEmpty()) return;
    ele=top->data;
}

//put element at the top of stack
template <class T>
void StackLinked<T>::push(T ele)
{
    nodePtr newNode=new Node(ele);
    newNode->next=top;
    top=newNode;
    sizeOfStack++;
}

//get top element in stack
template <class T>
void StackLinked<T>::pop(T &ele)
{
    if (isEmpty()) return;
    ele=top->data;
    cursor=top;
    top=top->next;
    delete(cursor);
    sizeOfStack--;
}

//return size of stack
template <class T>
int StackLinked<T>::stackSize() const
{
    return sizeOfStack;
}

//traverse elements in stack
template <class T>
void StackLinked<T>::traverse(void(*pf)(T)) const
{
    if(isEmpty()) return;
    nodePtr tempNode=top;
    while(tempNode!=NULL)
    {
        (*pf)(tempNode->data);
        tempNode=tempNode->next;
    }
}
