#include <stdio.h>
#include <iostream>
using name sapce std;

int calculator ()
{
float N1 ,N2 ,Result;
char operation;
printf ("\nEnter the equation = ");
scanf ("%f %c %f" ,&N1 ,&operation ,&N2);
if (operation == '+')
     printf ("the result = %.2f\a" ,N1+N2);
else if (operation == '-')
     printf ("the result = %.2f\a" ,N1-N2);
else if (operation == '*')
     printf ("the result = %.2f\a" ,N1*N2);
else if (operation == '/')
printf ("the result = %.2f\a" ,N1/N2);
else if (operation == '%')
printf ("the result = %d\a" ,(int)N1%(int)N2);
return 0;
}

int main ()
{
calculator();
while (1)
{
calculator();
}
}