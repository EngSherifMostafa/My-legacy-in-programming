#include <iostream>
using namespace std;
#include "StackLinked.cpp"

int main()
{
	StackLinked<char> s;
    char oriStr[]={'M','y','t','e','x','t'};
	char revStr[6]={'\0'};

    for(int i=0;i<6;i++)
        s.push(oriStr[i]);

    for(int i=0;i<6;i++)
        s.pop(revStr[i]);

    cout<<"Original text: ";
    for(int i=0;i<6;i++)
        cout<<oriStr[i];

    cout<<"\nReverse text: ";
    for(int i=0;i<6;i++)
        cout<<revStr[i];

    return 0;
}
