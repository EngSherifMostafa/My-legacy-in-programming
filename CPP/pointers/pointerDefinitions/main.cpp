#include <iostream>
using namespace std;

int main ()
{
    int var = 15;
    int *ptr = &var;
    int arr [5] = {0};

    cout << "var = " << var << endl; //get value of var
    cout << "&var = " << &var << endl; //get address of var
    cout << "--------------------------------------------------------" << endl;

    cout << "*ptr = " << *ptr << endl; //get value in ptr
    cout << "ptr = " << ptr << endl; //get address of ptr
    cout << "--------------------------------------------------------" << endl;

    cout << "*ptr + 1 = " << *ptr+1 << endl; // adding one to value of ptr
    cout << "ptr + 1 = " << ptr+1 << endl; // adding one size to address of ptr
    cout << "--------------------------------------------------------" << endl;

    cout << "*arr = " << *arr << endl; //get value of first element in array
    cout << "arr = " << arr << endl; //get address of first element in array
    cout << "--------------------------------------------------------" << endl;

    return 0;
}
