#include <iostream>
using namespace std;
#include "QueueLinked.cpp"

template <class T>
void display(T ele)
{
    cout<<ele<<"\t";
}

int main()
{
    QueueLinked<int> q,evenQ,oddQ;

    for(int i=1;i<=10;i++)
        q.enQueue(rand()%10);

    cout<<"Original Queue: \n";
    q.traverse(&display);
    cout<<endl;
    q.split(evenQ,oddQ);

    cout<<"Even Queue: \n";
    evenQ.traverse(&display);
    cout<<endl;

    cout<<"Odd Queue: \n";
    oddQ.traverse(&display);
    cout<<endl;

    return 0;
}
