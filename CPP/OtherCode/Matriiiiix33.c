#include<stdio.h>
#include<conio.h>
void show_matrix(int mat[3][3]);
void add_matrix(int matA[3][3], int matB[3][3], int matSum[3][3]);
int main()
{
 int x[3][3] = { {1,2,3}, {4,5,6}, {7,8,9} };
 int y[3][3] = { {1,4,7}, {2,5,8}, {4,1,2} };
 int z[3][3];
 add_matrix(x,y,z);
 printf("\nFirst matrix is :\n");
 show_matrix(x);
 printf("\nSecond matrix is :\n");
 show_matrix(y);
 printf("\nNew addition matrix is :\n");
 show_matrix(z);
 getch();
 return 0;
}


void add_matrix(int matA[3][3], int matB[3][3], int matSum[3][3])
{
  int r,c;
  for(r=0; r<3; r++)
  {
    for(c=0; c<3; c++)
        matSum[r][c]=matA[r][c]+matB[r][c];
  }
}


void show_matrix(int mat[3][3])
{
  int r,c;
  for(r=0; r<3; r++)
  {
    for(c=0; c<3; c++)
        printf(" %d",mat[r][c]);
    printf("\n");
  }
}
