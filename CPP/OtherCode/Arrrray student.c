#include<stdio.h>
#include<conio.h>
int main() 
{
        int x[5]={10 , 70 , 30 , 20 , 80 } ;
        int total = 500 , i = 0 ;
        float per ;
        int sum=0 ;
       
        for(i=0 ; i<5 ; i++) 
        {
        sum = x[i] + sum ;
        }
        printf("sum= %d \n \n" , sum );
          
        per =(sum*100)/total;
        printf("Percentage of degrees = %f %% \n \n", per);
        
        for(i=0 ; i<5 ; i++ )
        {
                  if( x[i]<100 && x[i]>=50 )
                  {
                  printf("subject %d = succeed \n \n",i+1);
                  }
                  else
                  {
                  printf("subject %d = failed \n \n",i+1);
                  }   
        }
    
        getch() ;
        return 0 ;
}
