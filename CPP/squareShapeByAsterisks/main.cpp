#include <iostream>
using namespace std;

int main()
{
    for (int line = 1 ; line <= 7 ; line++)
    {
        if (line == 1 || line == 7)
        {
            cout << "* * * *" << endl;
            continue;
        }

        else
            for (int x = line ; x <= 5 ; x++)
            {
                cout << "*     *" << endl;
                line++;
            }
    }
}
