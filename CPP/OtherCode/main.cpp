#include <stdio.h>
#include <iostream>
using namespace std;

int main()
{
    double a,b,r;
    int c;
    char opcode,again;

    while(1)
    {
        cout<<"Please enter two numbers: ";
        cin>>a>>b;

        cout<<"Please enter the operation: ";
        cin>>opcode;

        if (opcode=='+')
            cout<<"a + b = "<<a+b<<"\n";

            else if (opcode=='-')
                cout<<"a - b = "<<a-b<<"\n";

            else if (opcode=='*')
                cout<<"a * b = "<<a*b<<"\n";

            else if (opcode=='/')
                cout<<"a / b = "<<a/b<<"\n";

            else if (opcode=='^')
                r=1;
                c=1;
                while(c<=b)
            {
                r=r*a;
                c=c+1;
            }
                cout<<"a ^ b = "<<r<<"\n";

            /*else if ()
                r=1;
                c=1;
                while ()
                {


                c=c+1;
                }
                cout<<"a! = "<<r<<"\n";

            else
                cout<<"error !\n";
/*
        switch (opcode)
        {
            case'+':
                cout<<"a + b = "<<a+b<<"\n";
            break;

            case'-':
                cout<<"a - b = "<<a-b<<"\n";
            break;

            case'*':
                cout<<"a * b = "<<a*b<<"\n";
            break;

            case'/':
                cout<<"a / b = "<<a/b<<"\n";
            break;

            case'^':
                r=1;
                c=1;
                while(c<=b)
                {
                    r=r*a;
                    c=c+1;
                }
                cout<<"a ^ b = "<<r<<"\n";
            break;

            default:
            cout<<"error !\n";
            break;
        }
*/
        cout<<"again y/n: ";
        cin>>again;
        if (again=='n')
            break;
    }
}