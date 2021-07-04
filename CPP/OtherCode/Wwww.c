#include <stdio.h>
#include <conio.h>

int main()
{
    int x=1,y=5,z=6,w ;
    
     w= x-- + y-- + --z ;
     printf("%d \n" , w) ;
    
     w= --x - --y + z-- + w++ ;
     printf("%d \n" , w) ;
     
     w= --w - x-- + ++y + z ;
     printf("%d \n" , w) ;
     
     w+=(x++ + y-- + --z - w--) ;
      printf("%d \n" , w+=w) ;
     
     w/=(2*w + x++ - --y + z-- ) ;
      printf("%d \n" , w/=w) ;
    
     getch ();
     return 0;
}
