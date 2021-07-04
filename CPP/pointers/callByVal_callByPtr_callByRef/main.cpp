#include <iostream>
using namespace std;

void callByVal (int );
void callByRef (int &);
void callByPtr (int *);

int main()
{
    int x = 5;
    cout << "x = " << x << endl;

    callByVal(x);
    cout << "x = " << x << endl;

    callByRef(x);
    cout << "x = " << x << endl;

    int *xPtr = &x;
    callByPtr(xPtr);
    cout << "x = " << x << endl;

    return 0;
}


void callByVal (int val)
{
    val = 10;
    cout << "callByVal = " << val << endl;
}

void callByRef (int &refVar)
{
    refVar = 20;
    cout << "callByRef = " << refVar << endl;
}

void callByPtr (int *ptr)
{
    *ptr = 30;
    cout << "callByPtr = " << *ptr << endl;
}
