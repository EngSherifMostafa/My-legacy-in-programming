#include <iostream>
using namespace std;

void passByPtr (int *);
void passByPtrRef (int * &);

int box1 = 1;
int box2 = 2;
int *p1 = &box1;
int *p2 = &box2;

int main ()
{
    //passByPtr (p1);
    //passByPtrRef (p1);

    if (p1 == &box1)
        cout << "p1 is pointing to box1" << endl;
    else if (p1 == &box2)
        cout << "p1 is pointing to box2" << endl;
    else
        cout << "p1 is pointing to other box" << endl;


    if (p2 == &box2)
        cout << "p2 is pointing to box2" << endl;
    else if (p2 == &box1)
        cout << "p2 is pointing to box1" << endl;
    else
        cout << "p2 is pointing to other box" << endl;

    cout << "box1 = " << box1 << endl;
    cout << "box2 = " << box2 << endl;

    return 0;
}


void passByPtr (int *ptr) //make copy of original pointer
{
    *ptr = 3;
    ptr = p2;
    *ptr = 4;
}


void passByPtrRef (int *&ptrRef) //using original pointer
{
    *ptrRef = 5;
    ptrRef = p2;
    *ptrRef = 6;
}
