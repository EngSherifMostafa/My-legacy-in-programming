#include <iostream>
using namespace std;

int main()
{
    int arr [] = {1,2,3,4,5,6,7,8};
    int *ptr;
    ptr = arr; //assign address of first element in array and pointer ptr

    cout << "Numbers in array are : ";
    while (ptr <= (arr + 7)) //compare ptr address with address of last element in array
    {
        cout << *ptr;
        ptr++;
    }

    cout << endl << "Reverse numbers in array are : ";
    while (ptr > arr) //compare ptr address with address of first element in array
    {
        ptr--; //start with minus because ptr have address out of array from previous loop
        cout << *ptr;
    }
    return 0;
}
