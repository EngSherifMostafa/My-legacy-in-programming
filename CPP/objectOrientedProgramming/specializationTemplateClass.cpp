#include <iostream>
using namespace std;

template <class T>
class CheckType //generic template class
{
	public:
	CheckType(T e)
	{
		cout<<e<<"- not char"<<endl;
	}	
};

template <>
class CheckType <char> //specialization template class
{
	public:
	CheckType(char e)
	{
		cout<<e<<"- is a char"<<endl;
	}	
};

int main()
{
	CheckType<int> objOne(42);
	CheckType<double> objTwo(5.47);
	CheckType<char> objThree('S');
	
	return 0;
}