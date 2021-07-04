#include<stdio.h>
#include<conio.h>
int main()
{
int r1 , c1 , r2 , c2 ;
printf("plz enter number of rows of first matrix \n");
scanf("%d" , &r1) ;
printf("plz enter number of rows of second matrix \n");
scanf("%d" , &r2) ;
printf("plz enter number of colums of first matrix \n");
scanf("%d" , &c1) ; 
printf("plz enter number of colums of second matrix \n");
scanf("%d" , &c2) ;
  
int x[r1][c1] , y[r2][c2] , z[r2][c1] , i , j ;

if(c1=r2)
{
    for(i=0 ; i<r1 ; i++)
    {
          for(j=0 ; j<c1 ; j++) 
          {
              scanf("%d" ,x[i][j]) ;
                 
          }
    }
    
    for(i=0 ; i<r2 ; i++)
    {
          for(j=0 ; j<c2 ; j++) 
          {
              scanf("%d" ,y[i][j]) ;
                 
          }
    }
    
     z = multi(x,y);
}

  getch() ;
  return 0;
}

int[][] multi (int x[][] , int y[][])
{
        int r = sizeof(x) /(x[0]) ;
        int c = sizeof(y[0]) /size(y[0][0]) ;
        
        for(int i=0 ; i<r ; i++)
        {
                for(int j=0 ; j<c ; j++)
                {
                   z[i][j]=(x[i][j]*y[j][i])+ ;
                }
        }     
        return z ;        
}
