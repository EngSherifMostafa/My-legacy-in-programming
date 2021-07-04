#include <iostream>
using namespace std;

void Page_89_Ex_1 (void);
void Page_89_Ex_2 (void);
void Page_89_Ex_3 (void);
void Page_89_Ex_4 (void);

int main()
{
    int select = 0;
    cout << endl << "Select the exercises that you want to run : ";
    cin >> select;

    switch (select)
    {
    case (1): Page_89_Ex_1 (); break;
    case (2): Page_89_Ex_2 (); break;
    case (3): Page_89_Ex_3 (); break;
    case (4): Page_89_Ex_4 (); break;
    default: cout << "Error";
    }

    return 0;
}


void Page_89_Ex_1 (void)
{
    cout << "Page_89_Ex_1" << endl << "-------------" << endl;
    int arr[5] , maxx = 0 , minn = 0;
    for (int i = 0 ; i < 5 ; i++)
    {
        cout << "Enter value " << i+1 << " : ";
        cin >> arr[i];
    }

    maxx = minn = arr[0];
    for (int i = 0 ; i < 5 ; i++)
    {
        if (maxx < arr[i])
            maxx = arr[i];

        if (minn > arr[i])
            minn = arr[i];
    }

    cout << "Max number is : " << maxx << endl;
    cout << "Min number is : " << minn << endl;
    main();
}

void Page_89_Ex_2 (void)
{
    cout << "Page_89_Ex_2" << endl << "-------------" << endl;
    char String [6];
    for (int i = 0 ; i < 6 ; i++)
    {
        cout << "Enter char " << i+1 << " : ";
        cin >> String[i];
    }
    for (int i = 5 ; i >= 0  ; i--)
        cout << String[i];
    main();
}

void Page_89_Ex_3 (void)
{
    cout << "Page_89_Ex_3" << endl << "-------------" << endl;
    char String[6] , R_String[6];

    for (int i = 0 ; i < 6 ; i++) //insert char in original array
    {
        cout << "Enter char " << i+1 << " : ";
        cin >> String[i];
    }

    for (int o = 0 , r = 5 ; o < 6 , r >= 0 ; o++ , r--) //copy original array in reverse array
        R_String[r] = String[o];

    for (int i = 0 ; i < 6 ; i++) //display reverse array
        cout << R_String[i];
    main();
}

void Page_89_Ex_4 (void)
{
    cout << "Page_89_Ex_4" << endl << "-------------" << endl;
    main();
}
