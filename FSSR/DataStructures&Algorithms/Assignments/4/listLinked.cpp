#include "ListLinked.h"

//constructor
template <class K,class T>
List<K,T>::List()
{
    head=NULL; cursor=NULL; prev=NULL;
    sizeOfList=0;
}

//destructor
template <class K,class T>
List<K,T>::~List()
{
    makeListEmpty();
}

//return True if list is empty
template <class K,class T>
bool List<K,T>::isEmpty() const
{
    return (!head);
}

//return True if current position is empty
template <class K,class T>
bool List<K,T>::curIsEmpty() const
{
    return (!cursor);
}

//to make the current node the first node; if list is empty, the current position is still empty
template <class K,class T>
void List<K,T>::toFirst()
{
    cursor=head;
    prev=NULL;
}

//to return True if the current node is the first node or if the list and the current position are both empty
template <class K,class T>
bool List<K,T>::atFirst() const
{
    return (cursor==head);
}

//to advance to next node. Assume the current position is nonempty initially
template <class K,class T>
void List<K,T>::advance()
{
    if(curIsEmpty()) return;
    prev=cursor;
    cursor=cursor->next;
}

//to make the current node the tail node; if list is empty, the current position is still empty
template <class K,class T>
void List<K,T>::toEnd()
{
    if(isEmpty()) return;
    while(cursor->next!=NULL) advance();
}

//to return True if the current node is the tail node or if the list and the current position are both empty
template <class K,class T>
bool List<K,T>::atEnd() const
{
    //make isEmpty() first to check if list is empty return True before check cursor->next
    return (isEmpty() || cursor->next==NULL);
}

//to return the size of the list
template <class K,class T>
int List<K,T>::listSize() const
{
    return sizeOfList;
}

//to update the data portion of the current node to contain d; assume the current position is nonempty
template <class K,class T>
void List<K,T>::updateData(const T &d)
{
    if(curIsEmpty()) return;
    cursor->data=d;
}

//to return the data in the current node; assume the current position is nonempty
template <class K,class T>
void List<K,T>::retrieveData(K &retKey,T &retEle) const
{
    if(curIsEmpty()) return;
    retKey=cursor->key;
    retEle=cursor->data;
}

//insert a node with key (k) and data (d) at the head of the list; the new node becomes the current node
template <class K,class T>
void List<K,T>::insertFirst(const K &key,const T &data)
{
    //reserve new node in heap
    nodePtr newNode=new Node(key,data);
    newNode->next=head;
    head=newNode;
    //new node becomes the current node
    cursor=newNode;
    prev=NULL;
    sizeOfList++;
}

//insert a node after the current node without changing the current position;
//assume the current position is nonempty in a non-empty list
template <class K,class T>
void List<K,T>::insertAfter(const K &key,const T &data)
{
    //non-empty list
    if(isEmpty()) return;

    nodePtr newNode=new Node(key,data);
    newNode->next=cursor->next;
    cursor->next=newNode;
    sizeOfList++;
}

//insert a node before the current node; current position becomes the new node
template <class K,class T>
void List<K,T>::insertBefore(const K &key,const T &data)
{
    if(isEmpty()) return;
    nodePtr newNode=new Node(key,data);
    newNode->next=cursor;
    prev->next=newNode;
    cursor=newNode;
    sizeOfList++;
}

//insert a node at the end of the list, current position becomes the new node
template <class K,class T>
void List<K,T>::insertEnd(const K &key,const T &data)
{
    //sizeOfList will be increased at any of two function
    if(isEmpty())
        insertFirst(key,data);
    else
    {
		toEnd();
		insertAfter(key,data); //insertAfter is without changing the current position
		advance(); //so we change cursor position
    }
}

//delete the current node and set the current position to the next node;
//if the current node is the last node initially, the current position becomes empty;
//assume the current position is nonempty initially
template <class K,class T>
void List<K,T>::deleteNode()
{
    //current position is nonempty initially
    if(!curIsEmpty())
    {
		nodePtr delNode=cursor;

		if(atFirst()) //delete head node
		{
			cursor=cursor->next; //repeating this line because atFirst check if cursor is at head
			head=cursor;
		}

		else //delete non-head node
		{
			cursor=cursor->next; //advance() will change cursor & prev so prev will be deleted
			prev->next=cursor;
		}

		delete delNode;
		sizeOfList--;
    }
}

//delete the first node and set the current position to the next node;
//if it was initially the only node, the current position becomes empty;
template <class K,class T>
void List<K,T>::deleteFirst()
{
    if(!isEmpty())
    {
		toFirst();
		deleteNode(); //deleteNode will decrease size Of List
    }
}

//delete the last node and set the current position to empty
template <class K,class T>
void List<K,T>::deleteEnd()
{
    if(!isEmpty())
    {
        toEnd();
		deleteNode(); //deleteNode will decrease size Of List
    }
}

//delete whole list
template <class K,class T>
void List<K,T>::makeListEmpty()
{
    toFirst();
    while(!isEmpty()) deleteNode();
}

//search the list for the node with key part that matches (k).
//If found, set cursor to the node and return True, else return false and the current position becomes empty
template <class K,class T>
bool List<K,T>::searchKey(const K &key)
{
    if(isEmpty()) return 0;
    toFirst(); //set cursor = head
    while(cursor->key!=key)
    {
        advance();
        if(curIsEmpty()) return false; //return 0 when cursor reach to tail and cannot find key
    }
    return true;
}

//insert a node in a position that maintains an ascending order of the key portion of the nodes
template <class K,class T>
void List<K,T>::orderInsert(const K &key,const T &data)
{
    nodePtr newNode=new Node(key,data);
    if(isEmpty())
    {
		insertFirst(key,data); //size will increase inside insertFirst()
		return;
    }

    toFirst(); //set cursor = head
    //set cursor in position that cursor->key is greater than sent key
    while(cursor->key<key) advance();

    //insert new node before cursor, size will increase inside insertBefore()
    insertBefore(key,data);
}

//traverse list to print key and info fields
template <class K,class T>
void List<K,T>::traverse(void(*pf)(K,T)) const //pointer to function
{
	if(isEmpty()) return;
	nodePtr tempNode=head;

	while(tempNode) //send data while cursor is not empty
	{
		(*pf)(tempNode->key,tempNode->data);
		tempNode=tempNode->next;
	}
}

//split original list into two lists one for even and other for odd
template <class K,class T>
void List<K,T>::split(List<K,T> &evenList,List<K,T> &oddList)
{
	int key=1;
	toFirst();
	while(!curIsEmpty())
	{
		if(cursor->data%2==0)
			evenList.insertEnd(key++,cursor->data);

		else if(cursor->data%2==1)
			oddList.insertEnd(key++,cursor->data);
		
		advance();
	}
}
