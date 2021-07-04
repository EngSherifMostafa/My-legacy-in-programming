#include <iostream>
using namespace std;

void readArray(int arr[] , int sizeOfArr)
{
    cout << "Enter " << sizeOfArr << " numbers : ";
    for (int i=0 ; i<sizeOfArr ; i++)
        cin >> arr[i];
}

int sumArray(int *arr , int sizeOfArr)
{
    int sum=0;
    for (int i=0 ; i<sizeOfArr ; i++)
        sum+=arr[i];

    return sum;
}

int averageArray(int *arr , int sizeOfArr)
{
    int ave=0;
    for (int i=0 ; i<sizeOfArr ; i++)
        ave+=arr[i];

    return ave/sizeOfArr;
}

void reverseArray(int *arr , int sizeOfArr)
{
    cout << "Array in reverse is: ";

    for (int i=(sizeOfArr-1) ; i>= 0 ; i--)
        cout << arr[i] << " ";
}

string searchArr(int arr[] , int sizeOfArr , int searchItem)
{
    bool found=false;
    int counter=0;

    while (found==false && counter<sizeOfArr)
    {
        for (int i=0 ; i<sizeOfArr ; i++)
        {
            if (searchItem==arr[i])
                found=true;
            else
                counter++;
        }
    }
    if (found)
        return "This item is exist.";
    else
        return "This item is not exist.";
}

int main()
{
    int sizeOfArr=5 , searchItem=0;
    cout << "Enter size of array: "; cin >> sizeOfArr;
    int arr[sizeOfArr];

    //read array
    readArray (arr , sizeOfArr);

    //print sum of array
    cout << "Sum of array = " << sumArray (arr , sizeOfArr) << endl;

    //print average of array
    cout << "Average of array = " << averageArray (arr , sizeOfArr) << endl;

    //print reverse of array elements
    reverseArray(arr , sizeOfArr);

    //search item in array
    cout << "\nEnter number to check if it in array: "; cin >> searchItem;
    cout << "Result: " << searchArr(arr,sizeOfArr,searchItem);
    return 0;
}
