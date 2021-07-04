#include <iostream>
using namespace std;
#include "QueueDynamic.cpp"

template <class T>
void display(T ele)
{
    cout<<ele<<"\t";
}

int main()
{
    QueueDynamic<int> q(10);
    int retEle,queueLength;

    for(int i=1;i<=10;i++)
        q.enQueue(i*10);

    q.getFront(retEle);
    cout<<"front element = "<<retEle<<"\n";
    q.traverse(&display);cout<<"\n";
    queueLength=q.queueLength();
    cout<<"length of queue = "<<queueLength<<"\n";
    (q.isEmpty() ? cout<<"queue is empty\n":cout<<"queue is not empty\n");
    (q.isFull() ? cout<<"queue is full\n":cout<<"queue is not full\n");

    cout<<"dequeue elements from queue\n";
    for(int i=1;i<=10;i++)
    {
        q.deQueue(retEle);
        display(retEle);
    }

    queueLength=q.queueLength();
    cout<<"\nlength of queue = "<<queueLength<<"\n";
    (q.isEmpty() ? cout<<"queue is empty\n":cout<<"queue is not empty\n");
    (q.isFull() ? cout<<"queue is full\n":cout<<"queue is not full\n");
    return 0;
}
