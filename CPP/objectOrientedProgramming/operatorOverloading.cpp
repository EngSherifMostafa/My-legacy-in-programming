#include <iostream>
using namespace std;

class box
{
	public:
		int len,wid;
		box(){} //default constructor
		box(int l,int w):len(l),wid(w){} //parameterized constructor
  
		box operator+(const box &b)
		{
			box total; //new obj to be returned
			total.len=b.len+this->len;
			total.wid=b.wid+this->wid;
			return total;
		}
};

int main()
{
	box b1(5,10),b2(10,20),b3=b1+b2;
	cout<<"b1 = "<<b1.len<<"\t"<<b1.wid<<endl;
	cout<<"b2 = "<<b2.len<<"\t"<<b2.wid<<endl;
	cout<<"b3 = "<<b3.len<<"\t"<<b3.wid<<endl;
	return 0;
}