#include <iostream>
using namespace std;
void getOrder (int &);

int main()
{
    int jellyDonuts = 0;
    cout << "Before change : " << jellyDonuts << endl;
    getOrder (jellyDonuts); //pass int to function that received address of this int
    cout << "After change : " << jellyDonuts << endl;
    return 0;
}

void getOrder (int &donuts) //function get address of int
{
    cout << "How many doughunts do you want ? ";
    cin >> donuts; //any change of variable donuts change variable jellyDonuts
}
