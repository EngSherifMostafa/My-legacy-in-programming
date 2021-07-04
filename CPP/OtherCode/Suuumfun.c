#include<stdio.h>
#include<conio.h>
int main ()
{  
    int arr[]={5,2,3} ;
    printf("%d",sumfun(arr));
    
    getch();
    return 0;
}
int sumfun(int x[])
{
    int sum=0 , i;
    int len= sizeof(x) / sizeof(x[0]) ;
    
    for(i=0 ; i<len ;i++)
    {
            sum +=x[i] ;
    }
    return sum ;
}
