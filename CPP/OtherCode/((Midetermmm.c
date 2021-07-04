#include<stdio.h>
#include<conio.h>
int main(){
	int x, n;
	printf("enter x : ");
	scanf("%d", &x);
	printf("enter n : ");
	scanf("%d", &n);

	int s = 5;
	int y;
    int i1, i2, i3;	// loop variables
	        for (i1 = 1; i1 <= n; i1++)
            {
		    y = 1;
		    // power : x^i1    i1 = 1, 2, 3, ... , n
	     	for (i2 = 1; i2 <= i1; i2++)
            {
			y *= x;
		    }
		    // factorial : (i1)!    i1 = 1, 2, 3, ... , n
	     	for (i3 = i1; i3 >= 1; i3--)
            {
		   	y *= i3;
		    }
		    s += y;
            }
            printf("%d", s);
	
	getch ();
    return 0;
}

