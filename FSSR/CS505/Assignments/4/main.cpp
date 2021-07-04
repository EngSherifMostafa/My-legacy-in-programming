#include <iostream>
using namespace std;
#include "listLinked.cpp"

void display(int key,int data)
{
    cout<<key<<": "<<data<<"\n";
}

int main()
{
    List<int,int> l1,evenList,oddList;
    for(int i=1;i<=10;i++)
        l1.insertFirst(i,rand()%10);

    cout<<"All numbers are\n";
    l1.split(evenList,oddList);
    l1.traverse(&display);

    cout<<"\nEven numbers are\n";
    evenList.traverse(&display);

    cout<<"\nOdd numbers are\n";
    oddList.traverse(&display);

    return 0;
}
