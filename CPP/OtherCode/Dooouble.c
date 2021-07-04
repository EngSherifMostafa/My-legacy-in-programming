#include<stdio.h>
#include<conio.h>
int main() 
{
    int x[3] = { 1 , 2 , 3 } ;
    int y[3] ;
    int i ;
    for(i=0 ; i<3 ; i++ )
    {
    y[i] = x[i] * x[i] ;
    printf("%d \n" ,y[i]) ;
    }
    getch() ;
    return 0 ;
}
