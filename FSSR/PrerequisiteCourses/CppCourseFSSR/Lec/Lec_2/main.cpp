#include <iostream>
using namespace std;

void ex1 ();
void ex2 ();
void ex3 ();
void ex4 ();
void ex5 ();
void ex6 ();

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
        case 4: ex4(); break;
        case 5: ex5(); break;

        default: cout << "Error !";
    }
    return 0;
}


//get sum and average
void ex1 ()
{
    int x = 0, y = 0, z = 0;
    cout << "Enter three numbers : ";
    cin >> x >> y >> z;
    cout << "Sum is  = " << (x+y+z) << endl;
    cout << "Average = " << ((x+y+z)/3) << endl;
    main ();
}

//get odd and even
void ex2 ()
{
    int num = 0;
    cout << "Enter number : ";
    cin >> num;
    if (num%2 == 0)
        cout << "Even number" << endl;
    else
        cout << "Odd number" << endl;
    main ();
}

//sum from 1 to 20
void ex3 ()
{
    int sum = 0;
    for (int i = 0 ; i <= 20 ; i++)
        sum = sum + i;
    cout << "Sum : " << sum << endl;
    main ();
}

//sum for even number from 1 to 20
void ex4 ()
{
    int sum = 0;
    for (int num = 0 ; num <= 20 ; num++)
    {
        if (num % 2 == 0)
            sum = sum + num;
    }
    cout << "Sum of even number = " << sum << endl;
    main ();
}

//know difference between var++ and ++var
void ex5 ()
{
    int x = 2, y = 1;
    x++;
    cout << x++ << endl; //x = 3 then x = 4
    cout << ++x + y << endl; //x = 5 , result = 6
    cout << x++ + y << endl; //x = 5 then x = 6 , result = 6
    main ();
}
