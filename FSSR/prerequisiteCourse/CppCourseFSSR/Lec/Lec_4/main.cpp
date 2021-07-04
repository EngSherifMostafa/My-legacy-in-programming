#include <iostream>
using namespace std;

void ex1 ();
void ex2 ();
void ex3 ();

int main ()
{
    int ex = 0;
    cout << endl << "Enter Example No. : ";
    cin >> ex;

    switch (ex)
    {
        case 1: ex1(); break;
        case 2: ex2(); break;
        case 3: ex3(); break;
        default: cout << "Error !";
    }
    return 0;
}


//get values from user and sum even number only
void ex1 ()
{
    int arr [7] , sum = 0 , counter = 0;

    for (int i = 0 ; i < 7 ; i++)
    {
        cout << "Enter value " << i+1 << " : ";
        cin >> arr[i];

        if (arr[i] % 2 == 0)
        {
            sum = sum + arr[i];
            counter++;
        }
    }

    if (counter == 0)
        counter++;

    cout << "Sum = " << sum << endl;
    cout << "Average = " << sum / counter;
    main ();
}

//reverse array
void ex2 ()
{
    int arr [3];
    for (int i = 0 ; i < 3 ; i++)
    {
        cout << "enter value : ";
        cin >> arr[i];
    }

    for (int i = 2 ; i >= 0 ; i--)
    {
        cout << arr[i] << endl;
    }
    main ();
}

//get max and min in array
void ex3 ()
{
    int arr [10];

    for (int i = 0 ; i < 10 ; i++)
    {
        cout << "Enter value " << i+1 << " : ";
        cin >> arr[i];
    }

    int maxx = arr[0] , minn = arr[0];
    for (int i = 0 ; i < 10 ; i++)
    {
        if (arr[i] > maxx)
           maxx = arr[i];

        if (arr[i] < minn)
           minn = arr[i];
    }

    cout << endl << "Max number is : " << maxx << endl;
    cout << "Min number is : " << minn << endl;
    main ();
}
