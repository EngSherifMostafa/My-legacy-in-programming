#include <iostream>
using namespace std;
void createOneDArray ();
void createTwoDArrayFixedRow ();
void createTwoDArray();
void fillTwoDArray (int ** , int , int );
void printArray (int ** , int , int );

int main()
{
    createTwoDArray();
    return 0;
}

void createOneDArray ()
{
    int *ptr , sizeOfArr;
    cout << "enter size of array: ";
    cin >> sizeOfArr;
    ptr = new int[sizeOfArr];

    cout << "Enter " << sizeOfArr << " integers: ";
    for (int i=0 ; i<sizeOfArr ; i++)
        cin >> ptr[i]; //using pointer with index to process in array

    for (int i=0 ; i<sizeOfArr ; i++)
        cout << *(ptr+i) << "\t"; //using calculations to process in array
}

void createTwoDArrayFixedRow()
{
    int *ptr[3] , col;
    cout << "\nenter number of cols: ";
    cin >> col;

    for (int i=0 ; i<col ; i++)
        ptr[i]=new int[col];

    for (int r=0 ; r<3 ; r++)
    {
        for (int c=0 ; c<col ; c++)
            cout << ptr[r][c] << "\t";
        cout << endl;
    }
}

void createTwoDArray()
{
    int **ptr , row ,col;
    cout << "Enter number of row: "; cin >> row;
    cout << "Enter number of columns: "; cin >> col;

    ptr=new int *[row];

    for (int r=0 ; r<row ; r++)
        ptr[r]=new int [col];

    fillTwoDArray(ptr , row , col);
}

void fillTwoDArray (int **ptr , int row , int col)
{
    for (int r=0 ; r<row ; r++)
    {
        cout << "Enter " << col << " for row number " << r << ": ";
        for (int c=0 ; c<col ; c++)
            cin >> ptr[r][c];
    }
    printArray (ptr , row , col);
}

void printArray (int **ptr , int row , int col)
{
    for (int r=0 ; r<row ; r++)
    {
        for (int c=0 ; c<col ; c++)
            cout << ptr[r][c] << "\t";
        cout << endl;
    }
}
