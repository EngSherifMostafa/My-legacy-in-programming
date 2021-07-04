#include <iostream>
using namespace std;

void printArray(int *arr,int arrSize)
{
    for(int i=0;i<arrSize;i++)
        cout<<arr[i]<<" ";
    cout<<"\n";
}

void creatArray(int *&arr,int &arrSize)
{
    cout<<"Enter size of array: ";
    cin>>arrSize;
    arr=new int[arrSize];
}

void fillArray(int *&arr,int &arrSize)
{
    cout<<"Enter elements of array: ";
        for(int i=0;i<arrSize;i++)
            cin>>arr[i];
}

void removeDuplicate(int *arr, int arrSize, int *&retArr, int &retSize)
{
    bool condArr=0, condRetArr=0;
    int index=0;
    retSize=arrSize;
    for(int i=0;i<arrSize;i++)
        for(int j=i+1;j<arrSize;j++)
            if(arr[i]==arr[j])
                retSize--;

    retArr=new int[retSize];

    for(int i=0;i<arrSize;i++,condArr=0,condRetArr=0)
    {
        for(int j=i+1;j<arrSize;j++)
            if(arr[i]==arr[j])
            {
                retArr[index]=arr[i];
                index++;
                condArr=1;
                break;
            }

        if(!condArr)
        {
            for(int x=0;x<index;x++)
                if(arr[i]==retArr[x])
                {
                    condRetArr=1;
                    break;
                }

            if(!condRetArr)
            {
                retArr[index]=arr[i];
                index++;
            }
        }
    }
}

void intersectArrays(int *arrOne, int sizeOne, int *arrTwo, int sizeTwo, int *&result, int &resultSize)
{
    int index=0;
    resultSize=0;

    for(int i=0;i<sizeOne;i++)
        for(int j=0;j<sizeTwo;j++)
            if(arrOne[i]==arrTwo[j])
            {
                resultSize++;
                break;
            }
    result=new int[resultSize];

    for(int i=0;i<sizeOne;i++)
        for(int j=0;j<sizeTwo;j++)
            if(arrOne[i]==arrTwo[j])
            {
                result[index]=arrOne[i];
                index++;
                break;
            }
}

void unionArrays(int *arrOne, int sizeOne, int *arrTwo, int sizeTwo, int *&result, int &resultSize)
{
    int index=0;
    resultSize=sizeOne+sizeTwo;
    result=new int[resultSize];

    for(int i=0;i<sizeOne;i++)
    {
        result[index]=arrOne[i];
        index++;
    }

    for(int j=0;j<sizeTwo;j++)
    {
        result[index]=arrTwo[j];
        index++;
    }
}

void descendingArray(int *&arr, int arrSize)
{
    for(int i=0;i<arrSize;i++)
        for(int j=i+1;j<arrSize;j++)
            if(arr[j]>arr[i])
            {
                arr[j]+=arr[i];
                arr[i]=arr[j]-arr[i];
                arr[j]-=arr[i];
            }
}

void ascendingArray(int *&arr, int arrSize)
{
    for(int i=0;i<arrSize;i++)
        for(int j=i+1;j<arrSize;j++)
            if(arr[j]<arr[i])
            {
                arr[j]+=arr[i];
                arr[i]=arr[j]-arr[i];
                arr[j]-=arr[i];
            }
}


int main()
{
    char choose,again='Y';
    int *arrOne, sizeOne, *arrTwo, sizeTwo, *resArr, resSize;

    while(again=='y'||again=='Y')
    {
        creatArray(arrOne,sizeOne);
        creatArray(arrTwo,sizeTwo);

        fillArray(arrOne,sizeOne);
        fillArray(arrTwo,sizeTwo);

        cout<<"A- Arrays intersection\n";
        cout<<"B- Arrays union\n";
        cout<<"C- Remove duplicate\n";
        cout<<"D- Ascending elements\n";
        cout<<"E- Descending elements\n";
        cout<<"Choose: ";
        cin>>choose;

        switch(choose)
        {
            case 'A':
            cout<<"\nArrays intersection: "<<endl;
            intersectArrays(arrOne,sizeOne,arrTwo,sizeTwo,resArr,resSize);
            printArray(resArr,resSize);
            break;

            case 'B':
            cout<<"\nArrays union: "<<endl;
            intersectArrays(arrOne,sizeOne,arrTwo,sizeTwo,resArr,resSize);
            printArray(resArr,resSize);
            break;

            case 'C':
            cout<<"\nArrays after remove duplicate: "<<endl;
            removeDuplicate(arrOne,sizeOne,arrOne,sizeOne);
            removeDuplicate(arrTwo,sizeTwo,arrTwo,sizeTwo);
            printArray(arrOne,sizeOne);
            printArray(arrTwo,sizeTwo);
            break;

            case 'D':
            cout<<"\nAscending elements: "<<endl;
            ascendingArray(arrOne,sizeOne);
            printArray(arrOne,sizeOne);
            break;

            case 'E':
            cout<<"\nDescending elements: "<<endl;
            descendingArray(arrTwo,sizeTwo);
            printArray(arrTwo,sizeTwo);
            break;
        }

        delete[]arrOne;
        delete[]arrTwo;
        delete[]resArr;

        cout<<"\nAgain y/n: ";
        cin>>again;
    }
    return 0;
}
