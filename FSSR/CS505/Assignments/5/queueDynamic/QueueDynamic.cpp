#include "QueueDynamic.h"

//constructor
template <class T>
QueueDynamic<T>::QueueDynamic(int nEle)
{
    front=0; rear=-1; lengthOfQueue=0; MaxSize=nEle;
    queue=new T[MaxSize];
}

//destructor
template <class T>
QueueDynamic<T>::~QueueDynamic()
{
    delete []queue;
}

//return true if queue empty
template <class T>
bool QueueDynamic<T>::isEmpty() const
{
    return !lengthOfQueue;
}

//return true if queue full
template <class T>
bool QueueDynamic<T>::isFull() const
{
    return (lengthOfQueue==MaxSize);
}

//get front element without changing queue
template <class T>
void QueueDynamic<T>::getFront(T &ele) const
{
    if(isEmpty()) return;
    ele=queue[front];
}

//put element at the rear of queue
template <class T>
void QueueDynamic<T>::enQueue(T ele)
{
    if(isFull()) return;
    rear=(rear+1)%MaxSize;
    queue[rear]=ele;
    lengthOfQueue++;
}

//get front element in queue
template <class T>
void QueueDynamic<T>::deQueue(T &ele)
{
    if(isEmpty()) return;
    ele=queue[front];
    front=(front+1)%MaxSize;
    lengthOfQueue--;
}

//return length of queue
template <class T>
int QueueDynamic<T>::queueLength() const
{
    return lengthOfQueue;
}

//traverse elements in queue
template <class T>
void QueueDynamic<T>::traverse(void(*pf)(T)) const
{
	if(isEmpty()) return;
	int f=front;
	while(f!=rear)
	{
		(*pf)(queue[f]);
		f=(f+1)%MaxSize;
	}
	(*pf)(queue[rear]);
}
