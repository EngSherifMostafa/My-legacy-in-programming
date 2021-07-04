#include <iostream>
using namespace std;

class Mother
{
	public:
	Mother();
	~Mother();
};

class Daughter:public Mother
{
	public:
	Daughter();
	~Daughter();
};

Mother::Mother()
{
	cout << "mother constructor" << endl;
}

Mother::~Mother()
{
	cout << "mother destructor" << endl;
}

Daughter::Daughter()
{
	cout << "daughter constructor" << endl;
}

Daughter::~Daughter()
{
	cout << "daughter destructor" << endl;
}

int main ()
{
	Daughter dauObj;
       return 0;
}