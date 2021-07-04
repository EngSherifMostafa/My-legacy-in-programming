#include<stdio.h>
#include<conio.h>

int main()
{
    float x,y_sum=0 , term ;
    int n ,i;
    printf("enter x and n \n ") ;
    scaf(" %f %d " , &x , &n );
    x=x*3.14/180 ;
    term=x ;
    for(i=0 ; i<=n ;i++)
    {
       y_sum+=term ;
       term*=-( (x*x)/((i+1)*(i+2)) ) ;   
    }
       printf("y=%f" , y_sum ) ;
    
       getch(); 
       return 0 ;
       }
