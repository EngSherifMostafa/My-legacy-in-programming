#include <iostream>
using namespace std;

int main ()
{
    int arr [5];
    int *ptr = arr; //address of first element of array = address of created pointer

    cout << "Enter 5 numbers : " << endl;
    /* add addresses (every one equivalent 4 bytes)
    to first pointer that equal address of first element of array */
    for (int i = 0 ; i < 5 ; i++)
        cin >> *(ptr + i);

    cout << "Your numbers are : " << endl;
    /* another way of display array using pointer of array itself
    that point to first element in array */
    for (int i = 4 ; i >= 0 ; i--)
        cout << *(arr + i) << endl;
    return 0;
}
