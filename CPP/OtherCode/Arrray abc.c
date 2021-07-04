#include<stdio.h>
#include<conio.h>
int main() 
{  
     
    char x[3] = { 'a' , 'b' , 'c' } ;
    int i=0 ;
    int j=2 ;
    for(i=0 ; i<3 ; i++ )
    {
    printf(" %c " , x[i] ) ;
    }
    
    printf ("\n") ;
   
    for(j=2 ; j>=0 ; j-- )
    {
    printf(" %c " , x[j] ) ;
    }
    
    getch() ;
    return 0 ;
}
