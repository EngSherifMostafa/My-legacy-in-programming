#include <iostream>
using namespace std;

class Circle
{
private:
    static int counter;
    double radius;
public:
    Circle (int radius)
    {
        this->radius=radius;
        counter++;
    }

    double getArea ()
    {
        return 3.14*radius*radius;
    }

    static int getCount ()
    {
        return counter;
    }
};

int Circle::counter =0; //initialized static variable outside class
int main ()
{
    Circle c1(3.3);
    Circle c2(4.5);
    cout << "Total objectives is = " << Circle::getCount() << endl; //can call static methods by className::methodName();
    return 0;
}
