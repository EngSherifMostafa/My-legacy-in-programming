#include <iostream>
#include "StackLinked.cpp"
using namespace std;

template <class T>
void display(T ele)
{
    cout<<ele<<"\t";
}

int main()
{
    StackLinked<int> s;
	int dec;
	cout<<"Enter positive decimal number: ";
	cin>>dec;
	if(dec<0)
	{
		cout<<"invalid number"<<endl;
		return 0;
	}

	else if(dec==0)
	{
		cout<<"Binary number = "<<0<<endl;
		return 0;
	}
	else
	{
		while(dec>0)
		{
			s.push(dec%2);
			dec/=2;
		}
		s.traverse(&display);
	}
    return 0;
}
