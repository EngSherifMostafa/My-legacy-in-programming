
// storage classes 
//-------------------- 
// 1 - auto : 
//--------------

#include <stdio.h>
#include <stdlib.h>
#include <string.h>
// 2- register ; 
//---------------
int main ()
{
register  a  ;
printf ("REG a = %i",sizeof(a)) ;
printf ("REG a value = %d ",a);
printf ("REG a address = %d ",&a );

return 0 ; 
}

//***************************
//3- static ; 
//-------------------
#include <stdio.h>
 
/* function declaration */
void func(void);
 
static int count = 5; /* global variable */
 
main() {

   while(count--) {
      func();
   }
	
   return 0;
}

/* function definition */
void func( void ) {

   static int i = 5; /* local static variable */
   i++;

   printf("i is %d and count is %d\n", i, count);
}