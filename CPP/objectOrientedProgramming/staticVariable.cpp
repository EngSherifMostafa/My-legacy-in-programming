#include <iostream>
using namespace std;

class Circle
{
private:
    double radius;
public:
    static int counter; //it mustn't be initialized static variable in declaration
    Circle (int radius)
    {
        this->radius = radius;
        counter++;
    }

    double getArea ()
    {
        return 3.14*radius*radius;
    }
};

int Circle::counter = 0; //must be initialized static variable outside class
int main ()
{
    Circle c1(3.3);
    Circle c2(4.5);
    cout << "Total objects = " << Circle::counter << endl;
    return 0;
}
