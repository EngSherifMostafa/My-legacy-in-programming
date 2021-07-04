#include <iostream>
using namespace std;

template <class T>
class Box //template class
{
	T len,wid;
	public:
	T add(T a,T b);
};

template <class T> //must be redefine template every time we use
T Box<T>::add(T a,T b)
{
	return a+b;  
}

int main()
{
	//it must be determine data type of template class
    Box<int> b1;
    cout<<"Return func = "<<b1.add(5,7);
    return 0;
}