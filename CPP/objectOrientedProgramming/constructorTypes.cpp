#include<iostream>
using namespace std;
class Circle //specify a class
{
    private :
    double radius; //class data members

    public: Circle() //default constructor
    {
        radius = 0;
    }

    Circle(double r) //parameterized constructor
    {
        radius = r;
    }

    Circle(Circle &t) //copy constructor
    {
        radius = t.radius;
    }

    void setRadius(double r) //function to set data
    {
        radius = r;
    }

    double getArea()
    {
        return 3.14 * radius * radius;
    }

    ~Circle() //destructor
    {}
};

int main()
{
    Circle c1; //default constructor invoked
    Circle c2(2.5); //parmeterized constructor invoked
    Circle c3(c2); //copy constructor invoked
    cout << c1.getArea()<<endl;
    cout << c2.getArea()<<endl;
    cout << c3.getArea()<<endl;
    return 0;
}
