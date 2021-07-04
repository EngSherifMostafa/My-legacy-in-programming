#include <iostream>
#include "iomanip" //for setw (n) function
using namespace std;

int main()
{
    cout
    << setw (22) << "long double size is : " << sizeof(long double) << endl << endl
    << setw (22) << "double size is : " << sizeof(double) << endl
    << setw (22) << "long long size is : " << sizeof(long long) << endl << endl
    << setw (22) << "float size is : " << sizeof(float) << endl
    << setw (22) << "long size is : " << sizeof(long) << endl
    << setw (22) << "int size is : " << sizeof(int) << endl << endl
    << setw (22) << "short int size is : " << sizeof(short int) << endl
    << setw (22) << "short size is : " << sizeof(short) << endl << endl
    << setw (22) << "char size is : " << sizeof(char) << endl
    << setw (22) << "bool size is : " << sizeof(bool) << endl;
    return 0;
}
