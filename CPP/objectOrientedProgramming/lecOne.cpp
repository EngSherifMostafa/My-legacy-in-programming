#include <iostream>
using namespace std;

struct triangle //by default struct is public
{
	int hight=0, base=0;

	triangle (int hight, int base)
	{
		this->hight=hight;
		this->base=base;
	}

	void area()
	{
		cout << "\nTriangle area = " << 0.5*base*hight;
	}
};

class Rect
{
    int len=0,width=0; //attribute by default private (no modifiers)

    public: //access modifier
    Rect(int len,int width) //constructor
    {
        this->len=len, this->width=width; //this.var mean variable in class
    }

    void recArea () //method
    {
        cout << "\nRectangle area = " << len*width;
    }

    Rect (int len) //overloading constructor (define more than one constructor by different variables)
    {
        this->len=len;
    }

    void squareArea ()
    {
        cout << "\nSquare area = " << len*4;
    }
};

class Circle
{
    const float pi=3.1415;
    int di=0;

    public:
    Circle (int di)
    {
        this->di=di;
    }
    void area(); //prototype of external method outside class
};

    void Circle:: area () //method outside class (external)
    {
        cout << "\nCircle area = " << pi*di*di;
    }

int main ()
{
    Rect recOne(10,5); //define object from class & give values using constructor
    recOne.recArea(); //play method using objective

    Rect recTwo(5);
    recTwo.squareArea();

    Circle cirOne(5);
    cirOne.area();

 	triangle tri1(20,10);
	 tri1.area();

    cout << "\n";
    return 0;
}
