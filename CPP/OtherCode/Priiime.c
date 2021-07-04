#include<stdio.h>
#include<conio.h>
int check_prime (int x ) ;
int main()
{
    int x,y ;
   printf("plz enter num \n ");
   scanf("%d" , &x );
   y=check_prime(x) ;
   printf("%d",y);
   
   getch();
   return 0 ;
}

int check_prime (int x ) 
 {
    int i ;
    for(i=2 ; i<x ;i++ )
    {
            if(x%i ==0 )
            {
                   return 0 ;
            }
             else
             { 
                  return 1 ;
             }
    }
}         
/*

#include<iostream>
using namespace std;
void prime(int x,int i=2)
{
if(i<x)
{
if(x%i!=0)
{
i++;
prime(x,i);
}
else if(x%i==0)
{
cout<<"not prime ";
return ;
}
}
else
{
cout<<"prime";
return;
}
}
int main()
{
prime(8);
}
*/
