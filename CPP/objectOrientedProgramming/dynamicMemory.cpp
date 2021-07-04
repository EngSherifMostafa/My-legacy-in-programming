#include <iostream>
using namespace std;
void dynVar();
void dynArr();

int main()
{
    dynVar();
	dynArr();
	return 0;
}

void dynVar()
{
	 //This allocates the memory size necessary for storing an integer on the heap, and returns that address.
	new int;
	int *ptr=new int;
	*ptr=5;
	cout<<"ptr value = "<<*ptr<<endl;
	//The pointer p is stored in the stack as a local variable, and holds the heap's allocated address as its value. The value of 5 is stored at that address in the heap.
	delete ptr; //pointer still point to address but this address carry 0 or null
	//delete ptr == *ptr=NULL
	cout<<"ptr value = "<<*ptr<<endl;
}

void dynArr()
{
    //Dynamic memory can also be allocated for arrays.
	int *ptrToArr = NULL;
	ptrToArr=new int[10];
	
	for(int i=0;i<10;i++)
	    cout<<*ptrToArr+i<<endl;
		
	delete []ptrToArr;
}