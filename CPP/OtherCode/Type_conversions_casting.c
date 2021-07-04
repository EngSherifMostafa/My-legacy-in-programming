#include <stdio.h>
#include <stdlib.h>
#include <string.h>


int main ()
{



/*
int a = 55 ;
int b =  745 ;
if (a <= b && a-b != 0)
    printf ("\nA IS GERATER\n") ;
*/

/*
   int val;
   char str[20];

   strcpy(str, "98993489");                  //string representation of an integral number.
   val = atoi(str);
   printf("String value = %s, Int value = %d\n", str, val);

   strcpy(str, "tutorialspoint.com");
   val = atoi(str);
   printf("String value = %s, Int value = %d\n", str, val);

  */

  /*
  if long double convert the other to long double
  if double convert the other to double
  if long float convert the other to float
  if long char convert the other to char
   but no if one float other double no auto convertion
  */

 unsigned char a = 'A' ;
 printf ("a = %c\n",a) ;
/*
//example1  :
//*****************
unsigned char number1 = 200 ;
int number2 = 50000 ;
printf ("Sum = %d\n", number1+number2) ;
*/
/*
//example2  :
//*****************
   int sum = 17, count = 5;
   double mean;

   mean = (double) sum / count;
   printf("Value of mean : %f\n", mean );
*/
/*
//example3  :
//*****************

int  i = 17;
   char c = 'c'; // ascii value is 99 
   int sum;

   sum = i + c;
   printf("Value of sum : %d\n", sum );
*/


   return(0);
}


/*

type casting
--------------
Type casting is a way to convert a variable from one data type to another data type. For example, if you want to store a 'long' value into a simple integer then you can type cast 'long' to 'int'. You can convert the values
from one type to another
explicitly using the cast operator as follows
(type_name) expression

*/
/*
main() {
   
 
   int sum = 17, count = 5;
   double mean;

   mean = (double) sum / count;
   printf("Value of mean : %f\n", mean );
   
}
*/
/*

#include <stdio.h>
#include <float.h>

int main() {

   printf("Storage size for float : %d \n", sizeof(float));
   printf("Minimum float positive value: %E\n", FLT_MIN );
   printf("Maximum float positive value: %E\n", FLT_MAX );
   printf("Precision value: %d\n", FLT_DIG );
   
   return 0;
}
*/
















































/*
int atoi (char s[])
{
    int i , n ;
    n =0 ;
    for (i = 0 ; s[i]> '0' && s[i]<='9' ; i++)
        n = 10 *n + (s[i] -'0') ;
    return n ;
}
*/
/*
int lower (int c)
{
    if (c>= 'A' && c<= 'Z')
        return c+ 'a' - 'A' ;
    else
        return c ;
}
*/

