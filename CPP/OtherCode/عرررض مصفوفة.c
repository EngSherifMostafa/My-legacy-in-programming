#include<stdio.h>
#include<conio.h>
int main(){
	int x[5][5] ;
	int row,colmn,i,j;
	
	printf("Enter the dimentions of the Matrix \n");
	scanf("%d %d",&row,&colmn);

	
	for(i=0;i<row;i++){
		for( j=0;j<colmn;j++){
		printf("Enter the element of %d,%d\n",i+1,j+1);
		scanf("%d", &x[i][j] );
		}
	}
	
	printf("\n\nThe matrix :\n\n");
	
	for(i=0;i<row;i++){
		for(j=0;j<colmn;j++){
			printf("%d\t", x[i][j] );
		}
		printf("\n");

	}
getch();
return 0;
}
