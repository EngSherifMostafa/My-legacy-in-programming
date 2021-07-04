#include <stdio.h>
int main ()
{
    int Bills_of_20 ,Bills_of_10 ,Bills_of_5 ,Bills_of_1 ,amount;
    printf ("Enter the amount of money = ");
    scanf("%d" ,&amount);
    Bills_of_20 = amount / 20;
    amount %= 20;
    Bills_of_10 = amount / 10;
    amount %= 10;
    Bills_of_5 = amount / 5;
    amount %= 5;
    Bills_of_1 = amount;
    printf("20_L.E Bills = %d\n10_L.E Bills = %d\n 5_L.E Bills = %d\n 1_L.E Bills = %d\n" ,Bills_of_20 ,Bills_of_10 ,Bills_of_5 ,Bills_of_1);
    return 0;
}