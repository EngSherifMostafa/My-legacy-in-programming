#include<stdio.h>
#include<conio.h>
// matrices multiplication 
int main(){
	int mat1[5][5], mat2[5][5] ,mult[5][5];
	int col1,col2,row1,row2;
	
	printf("Enter the dimentions x1,y1 of matrix one\n");
	scanf("%d%d",&row1,&col1);
	printf("Enter the dimentions x2,y2 of matrix two\n");
	scanf("%d%d",&row2,&col2);  
	
	if(col1!=row2)
	{
    	printf("\n\ny1 not equal to x2 , can't be multiplied \n");
    }
    else{
	
	    printf("Matrix one\n");
        for(int i=0;i<row1;i++){
		for(int j=0;j<col1;j++){
		printf("Enter element %d,%d\n",i+1,j+1);
		scanf("%d",&mat1[i][j] );
		}
	  }
     
	    printf("\n\nMatrix Two\n");
        for(int i=0;i<row2;i++)
        {
 		for(int j=0;j<col2;j++)
        {
		printf("Enter element %d,%d\n",i+1,j+1);
		scanf("%d",&mat2[i][j] );
	  
        }
	  }

	    for(int i=0;i<col2;i++)
        {
		for(int j=0;j<row1;j++)
        {
		mult[j][i]=0;
      	for(int k=0;k<col2;k++){
		mult[j][i] += mat1[j][k]* mat2[k][i];
			}
         }
	  
	  
	  printf("\n\nThe result of multiplication:\n");
      for(int i=0;i<row1;i++) 
      {
		for(int j=0;j<col2;j++)
        {
			printf("%d\t", mult[i][j] );
        }
        printf("\n");
        } 
getch();
return 0 ;
	  
	
}
