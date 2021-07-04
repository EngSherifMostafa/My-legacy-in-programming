#include<stdio.h>
#include<conio.h>
int fac(int n) ;
int main()
{ 
  int x,y ;
  printf("plz enter num \n") ;
  scanf("%d" , &x);  
  y=fac(x);
  printf("fac=%d \n",y);
  getch();
  return 0;
}

int fac(int n) 
{
        if(n==0)
        {
        return 1;
        }
        else
        {
        return(n*(fac(n-1));
        }
}


/*int fac(int n) 
{
    int i ;
    int result=1 ;
    for(i=n ;i>0 ;i-- )
    {
    result*= i ;
    }
    return result ;
}  
*/
