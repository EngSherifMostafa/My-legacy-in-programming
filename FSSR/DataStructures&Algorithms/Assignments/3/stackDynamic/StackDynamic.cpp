#include "StackDynamic.h"

//constructor
template <class T>
StackDynamic<T>::StackDynamic(int nEle)
{
	top=0; MaxSize=nEle;
	stack=new T[MaxSize];
}

//destructor
template <class T>
StackDynamic<T>::~StackDynamic()
{
	delete []stack;
}

//return true if stack empty
template <class T>
bool StackDynamic<T>::isEmpty() const
{
    return !top;
}

//return true if stack full
template <class T>
bool StackDynamic<T>::isFull() const
{
    return top==MaxSize;
}

//get top element without changing stack
template <class T>
void StackDynamic<T>::getTop(T &ele) const
{
    if(isEmpty()) return;
    ele=stack[top-1];
}

//put element at the top of stack
template <class T>
void StackDynamic<T>::push(T ele)
{
	if(isFull()) return;
    stack[top++]=ele;
}

//get top element in stack
template <class T>
void StackDynamic<T>::pop(T &ele)
{
    if (isEmpty()) return;
    ele=stack[--top];
}

//return size of stack
template <class T>
int StackDynamic<T>::stackSize() const
{
    return top;
}

//traverse elements in stack
template <class T>
void StackDynamic<T>::traverse(void(*pf)(T)) const
{
    if(isEmpty()) return;
    for(int i=top-1;i>=0;i--)
        (*pf)(stack[i]);
}