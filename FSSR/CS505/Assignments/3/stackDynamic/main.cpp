#include <iostream>
using namespace std;
#include "StackDynamic.cpp"

template <class T>
void display(T ele)
{
    cout<<ele<<"\t";
}

int main()
{
    StackDynamic<int> s(10);
    int retEle,stackSize;

    for(int i=1;i<=10;i++)
        s.push(i*10);

    s.getTop(retEle);
    cout<<"top element = "<<retEle<<"\n";
    s.traverse(&display);cout<<"\n";
    stackSize=s.stackSize();
    cout<<"size of stack = "<<stackSize<<"\n";
    (s.isEmpty() ? cout<<"stack is empty\n":cout<<"stack is not empty\n");
    (s.isFull() ? cout<<"stack is full\n":cout<<"stack is not full\n");

    cout<<"pop elements from stack\n";
    for(int i=1;i<=10;i++)
    {
        s.pop(retEle);
        display(retEle);
    }

    stackSize=s.stackSize();
    cout<<"\nsize of stack = "<<stackSize<<"\n";
    (s.isEmpty() ? cout<<"stack is empty\n":cout<<"stack is not empty\n");
    (s.isFull() ? cout<<"stack is full\n":cout<<"stack is not full\n");
    return 0;
}
