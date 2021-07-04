#include <iostream>
using namespace std;

int main ()
{
    string names[4];
    string *ptr;
    ptr = names;

    cout << "Enter 4 strings : " << endl;
    for (int i = 0 ; i < 4 ; i++)
        cin >> ptr[i]; //using index in pointer

    for (int i = 0 ; i < 4 ; i++)
    {
        cout << *ptr << " ";
        ptr++; //adding one of sizeof(string) to pointer ptr
    }

    cout << endl;
    for (int i = 0 ; i < 4 ; i++)
    {
        ptr--; //start loop by minus because ptr in previous loop ended by ptr + 4
        cout << *ptr << " ";
    }
    return 0;
}
