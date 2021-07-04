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
    cout<<"Create new list"<<endl;
    (li.isEmpty() ? cout<<"List is empty" : cout<<"List is not empty"); cout<<endl;

    cout<<"Insert at first"<<endl;
    li.insertFirst(1,10); //(1,10)
    li.traverse(&displayList);
    (li.atFirst() ? cout<<"Cursor is at first" : cout<<"Cursor is not at first"); cout<<endl;
    (li.curIsEmpty() ? cout<<"Cursor is empty" : cout<<"Cursor is not empty"); cout<<endl;

    li.remMin(retkey,retData);
    cout<<"min key = "<<retkey<<"\ndata in min key = "<<retData<<"\n";

    cout<<"Insert 10 elements at end"<<endl;
    for(int i=2;i<11;i++) //(2,20):(10,100)
        li.insertEnd(i,i*10);
    li.traverse(&displayList);
    (li.atEnd() ? cout<<"Cursor is at end" : cout<<"Cursor is not at end"); cout<<endl;

    cout<<"Insert element after cursor"<<endl;
    li.insertAfter(13,120);
    li.traverse(&displayList);

    cout<<"Advance cursor"<<endl;
    li.advance();

    cout<<"Insert element before cursor"<<endl;
    li.insertBefore(12,120);
    li.traverse(&displayList);

  /*  cout<<"Insert element in ascending order"<<endl;
    li.orderInsert(11,110);
    li.traverse(&displayList);*/

    cout<<"Insert element in ascending order"<<endl;
    li.insertByKey(11,110);
    li.traverse(&displayList);



    cout<<"Retrieve from cursor"<<endl;
    li.retrieveData(retkey,retData);
    cout<<"Key = "<<retkey<<"\tData = "<<retData<<endl; retkey=0,retData=0;

    cout<<"Change cursor to first"<<endl;
    li.toFirst();
    li.retrieveData(retkey,retData);
    cout<<"Key = "<<retkey<<"\tData = "<<retData<<endl; retkey=0,retData=0;

    cout<<"Change cursor to tail"<<endl;
    li.toEnd();
    li.retrieveData(retkey,retData);
    cout<<"Key = "<<retkey<<"\tData = "<<retData<<endl; retkey=0,retData=0;

    cout<<"Size of list = "<<li.listSize()<<endl;

    cout<<"update data in cursor"<<endl;
    li.updateData(130);
    li.traverse(&displayList);

    cout<<"Insert key that you want to find: "; cin>>key;
    if(li.searchKey(key))
    {
        li.retrieveData(retkey,retData);
        cout<<"Key = "<<retkey<<"\tData = "<<retData<<endl; retkey=0,retData=0;
    }
    else cout<<"Key not found"<<endl;

    cout<<"Delete first node"<<endl;
    li.deleteFirst();
    li.traverse(&displayList);
    li.retrieveData(retkey,retData);
    cout<<"Key = "<<retkey<<"\tData = "<<retData<<endl; retkey=0,retData=0;

    cout<<"Delete end node"<<endl;
    li.deleteEnd();
    li.traverse(&displayList);
    li.retrieveData(retkey,retData);
    cout<<"Key = "<<retkey<<"\tData = "<<retData<<endl; retkey=0,retData=0;

    li.toFirst();
    cout<<"Delete cursor node"<<endl;
    li.deleteNode();
    li.traverse(&displayList);
    li.retrieveData(retkey,retData);
    cout<<"Key = "<<retkey<<"\tData = "<<retData<<endl; retkey=0,retData=0;

    cout<<"Delete all nodes"<<endl;
    li.makeListEmpty();
    li.traverse(&displayList);

    return 0;
}
