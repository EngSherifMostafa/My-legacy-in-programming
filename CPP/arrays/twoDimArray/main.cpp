#include <iostream>
using namespace std;
const int row=3;
const int col=4;

//initialize array with zeros
void initialZero(int arr[][col])
{
    for (int r=0 ; r<row ; r++)
    {
        for (int c=0 ; c<col ; c++)
            arr[r][c]=0;
    }
}

//fill 2D array
void fillArr(int arr[][col])
{
    for (int r=0 ; r<row ; r++)
        for (int c=0 ; c<col ; c++)
            cin >> arr[r][c];
}

//display 2D array
void display(int arr[][col])
{
    for (int r=0 ; r<row ; r++)
    {
        for (int c=0 ; c<col ; c++)
            cout << arr[r][c] << " " ;
        cout << endl;
    }
}

//sum of array
void sumArr(int arr[][col])
{
    int sum=0;
    for (int r=0 ; r<row ; r++)
    {
        for (int c=0 ; c<col ; c++)
            sum+=arr[r][c];
    }
    cout << "Sum of array = " << sum << endl;
}

//sum of each row
void sumRow(int arr[][col])
{
    int sum;
    for (int r=0 ; r<row ; r++)
    {
        sum=0;
        for (int c=0 ; c<col ; c++)
            sum+=arr[r][c];
        cout << "Sum of rows " << r+1 << " = " << sum << endl;
    }
}

//sum of each column
void sumCol(int arr[][col])
{
    int sum;
    for (int c=0 ; c<col ; c++)
    {
        sum=0;
        for (int r=0 ; r<row ; r++)
            sum+=arr[r][c];
        cout << "Sum of columns " << c+1 << " = " << sum << endl;
    }
}

//largest number in each row
void largItemRow(int arr[][col])
{
    int largeRow;
    for (int r=0 ; r<row ; r++)
    {
        largeRow=arr[r][0];
        for (int c=0 ; c<col ; c++)
        {
            if (largeRow<arr[r][c])
                largeRow=arr[r][c];
        }
        cout << "Large item in row " << r+1 << " = " << largeRow << endl;
    }
}

//largest number in each column
void largItemCol(int arr[][col])
{
    int largeCol;
    for (int c=0 ; c<col ; c++)
    {
        largeCol=arr[0][c];
        for (int r=0 ; r<row ; r++)
        {
            if (largeCol<arr[r][c])
                largeCol=arr[r][c];
        }
        cout << "Large item in column " << c+1 << " = " << largeCol << endl;
    }
}

//smallest item in array
void smallItemArray(int arr[][col])
{
    int small=arr[0][0];
    for (int r=0 ; r<row ; r++)
    {
        for (int c=0 ; c<col ; c++)
            if (small>arr[r][c])
                small=arr[r][c];
    }
    cout << "Smallest item in array = " << small << endl;
}

int main()
{
    int arr[row][col];
    cout << "Enter " << row*col << " integers: ";

    //initialize array with zeros
    initialZero(arr);

    //read from user
    fillArr(arr);

    //print array
    display(arr);

    //sum of array
    sumArr(arr);

    //find smallest item in array
    smallItemArray(arr);

    //find sum of each row
    sumRow(arr);
    return 0;
}
