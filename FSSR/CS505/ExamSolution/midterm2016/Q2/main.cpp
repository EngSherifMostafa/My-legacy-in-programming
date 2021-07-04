#include <iostream>
#include "ListLinked.cpp"
using namespace std;

//template <class T>
void displayList(int key,int ele)
{
    cout<<key<<"- "<<ele<<"\n";
}

int main()
{
    int key,retkey=0,retData=0;
    List<int,int> li;

    cout<<"Insert 10 elements at end"<<endl;
    for(int i=2;i<11;i++) //(2,20):(10,100)
        li.insertEnd(i,i*10);
    li.traverse(&displayList);
    (li.atEnd() ? cout<<"Cursor is at end" : cout<<"Cursor is not at end"); cout<<endl;

    li.revPrint();
    return 0;
}
