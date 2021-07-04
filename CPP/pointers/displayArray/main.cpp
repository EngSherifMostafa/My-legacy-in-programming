#include <iostream>
using namespace std;
/* prototype of function must take
1- type of output
2- name of function
3- arguments types
(if it array take []) (if it pointer take *)
name of arguments are optional */
void displayArr(int[], int);

int main ()
{
    int Size = 5;
    int arr[Size] = {1,2,3,4,5};
    displayArr(arr, Size);  //array pass as pointer
    return 0;
}

//function received array as pointer and int count to use it in for loop
void displayArr (int arr[], int Count)
{
    int *ptr;
    for (int i = 0 ; i < Count ; i++)
    {
        ptr = &arr[i]; //ptr take every address of array elements
        cout << *ptr; //every address taken is displayed before change
    }
}
