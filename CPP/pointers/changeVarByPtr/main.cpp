#include <iostream>
using namespace std;

int main ()
{
    int x = 25, y = 25, z = 25;
    int *ptr;
    cout << "Display before pointer change value\n";
    cout << "x = " << x << "\nY = " << y << "\nZ = " << z << endl;

    ptr = &x; //ptr take address of x
    *ptr += 100; //ptr add 100 to what it point to

    ptr = &y;
    *ptr += 100;

    ptr = &z;
    *ptr += 100;
    cout << "Display after pointer change value\n";
    cout << "x = " << x << "\nY = " << y << "\nZ = " << z << endl;
    return 0;
}
