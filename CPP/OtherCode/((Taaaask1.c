#include<stdio.h>
#include<conio.h>
int main()
{
    int x1 , y1 , x2 , y2 ;
   
    printf(" enter p1 \n");
   
    scanf("%d %d " ,x1,y1);
   
    printf(" enter p2 \n");
   
    scanf("%d %d " ,x2,y2);
      
      if(y1>y2)
      {
            printf("p1 is greater \n") ;
      }
            else{
      
            if (y2>y1)
            {
            printf("p2 is greater \n");
            }
            else{       
            if(x1>x2)
            {
             printf("p1 is greater \n");
            }
            
            else{   if(x2>x1)
            {
            printf("p2 is greater \n " );
            }
                else
                {
                    printf("p1=p2");
                    }
                    }
                    }
                    }
                    
                    getch();
                    return 0 ;
                    }
                    
                    
