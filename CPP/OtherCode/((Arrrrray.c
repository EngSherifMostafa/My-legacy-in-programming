#include<stdio.h>
#include<conio.h>
int main() 
{
    int s ;
    int i=0 ;
    int j=0 ;
    int sum =0 ;
    printf("enter size \n " );
    scanf(" %d " , &s );
    int x[s] ;
   
       for(i=0 ; i<s ; i++ )
       {
       x[i]=i+1 ;
       }
   
       for(j=0 ; j<s ; j++ )
       {
       sum=x[j]+ sum ;
       }
       printf("average=%d " , sum/s ) ;
           
   getch() ;
   return 0 ;
}
