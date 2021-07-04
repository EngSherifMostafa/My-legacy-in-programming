#include<stdio.h>
#include<conio.h>
int power( int base ,int e) ;
int main()
{ 
  int x,y ;
  printf("plz enter 2 num \n") ;
  scanf("%d %d" , &x, &y);  
  y=power(x,y);
  printf("power=%d \n",y);
  Getch() ;
  return 0;
}

int power( int base ,int e) 
{
        if(e==0)
        {
        return 1 ;
        }
        else
        {
        return (base*power(base,e-1)) ;
        }
}
