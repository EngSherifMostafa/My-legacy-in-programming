#include <stdio.h>
#include <conio.h>

int main()
{
  printf("%d" , factorial(3)) ;
 
  getch();
  return 0;
}

int factorial(int n) 
{
    int i ;
    int result=1 ;
    for(i=n ;i>0 ;i-- )
    {
    result*= i ;
    }
    return result ;
}  
