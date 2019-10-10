#include<stdio.h>
int main()
{
	int i,j,r,f,c,k;
  scanf("%d%d",&r,&c);
  int mat[r][c];
  for (i = 0; i < r; i++)
  {
     for (j = 0; j < c; j++)
     { 
       scanf("%d", &mat[i][j]);
     }
  }
  for (i = r-1; i >=0; i--)
  {
     for (j = 0; j <c; j++)
     { 
       printf("%d ", mat[j][i]);
     }
    printf("\n");
  }
	return 0;
}