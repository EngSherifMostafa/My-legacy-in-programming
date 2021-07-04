//hierarchy alphabetical shape by another way than it in page 69 ex18 ISSR prerequisite course
#include <iostream>
using namespace std;
int ch1 = 64;
int ch2 = 69;

int main()
{
	for (int l1=1;l1<=5;l1++)
	{
		for (int s1=1;s1<=5-l1;s1++)
			cout << " ";

		for (int a1=1;a1<=2*l1-1;a1++)
			{
                cout << (char) (ch1+l1);
                a1++;

                while (a1<(2*l1-1))
                {
                    cout << "-";
                    a1++;
                }

                if (a1 != 2)
                    cout << (char) (ch1+l1);
			}
		cout << endl;
	}

	for (int l2=4,x=1;l2>=1;l2--,x++)
	{
		for (int s2=5;s2>=l2+1;s2--)
			cout << " ";

		for (int a2=1;a2<=2*l2-1;a2++)
        {
            cout << (char) (ch2-x);
            a2++;

            while (a2<(2*l2-1))
            {
                cout << "-";
                a2++;
            }

			if (a2 != 2)
                cout << (char) (ch2-x);
        }
		cout << endl;
	}
	return 0;
}
