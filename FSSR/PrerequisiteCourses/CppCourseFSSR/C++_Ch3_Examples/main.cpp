#include <iostream>
using namespace std;

void Page_61_Ex_1 (void);
void page_62_Ex_2 (void);
void Page_63_Ex_3 (void);

int main()
{
    int select = 0;
    cout << endl << "Select the exercises that you want to run : ";
    cin >> select;

    switch (select)
    {
    case (1): Page_61_Ex_1(); break;
    case (2): page_62_Ex_2 (); break;
    case (3): Page_63_Ex_3(); break;
    default: cout << "Error";
    }

    return 0;
}


void Page_61_Ex_1(void)
{
    cout << "Page_61_Ex_1" << endl << "-------------" << endl;
    for (int line=1 ; line<=5 ; line++)
    {
        for (int n=1 ; n<=line ; n++)
            cout << n << " ";

        cout << endl;
    }
    main();
}

void page_62_Ex_2 (void)
{
    cout << "page_62_Ex_2" << endl << "-------------" << endl;
    for (int line=1 ; line<=5 ; line++)
    {
        for (int space=3;space>=line-1;space--)
            cout << " ";
        for (int a=1;a<=2*line-1;a++)
            cout << "*";

        cout << endl;
    }
    main();
}
/*
  Shape	    	   Lines		Spaces    Stars
    *                L1		      4 	    1
   ***               L2  	      3  	    3
  *****              L3		      2			5
 *******             L4  	      1		    7
*********            L5	          0		    9
*/

void Page_63_Ex_3 (void)
{
    cout << "Page_63_Ex_3" << endl << "-------------" << endl;
    cout << "+" << " ";
    for (int i=1;i<=5;i++)
        cout << i << " ";

    cout << endl;

    for (int x=1;x<=5;x++)
    {
        cout << x << " ";
        for (int y=1;y<=5;y++)
            cout << y+x << " ";

        cout << endl;
    }
    main();
}
