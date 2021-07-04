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


//Difference between continue and break
void ex1 ()
{
    for (int i = 1 ; i <= 3 ; i++)
    {
        cout << "welcome\n";
        continue;
        cout << "Hello!";
        cout << i*2;
    }
    main ();
}

//do while loop
void ex2 ()
{
    int i = 1;
    do
    {
        cout << "welcome\n";
        i++;
    }
    while (i <= 3);
    main ();
}

//Difference between var++ and ++var
void ex3 ()
{
    int j = 10;
    cout << j++;
    cout << ++j;
    main ();
}
