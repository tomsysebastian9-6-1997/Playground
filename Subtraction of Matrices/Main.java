#include<stdio.h>
int main()
{
int i,j,r,c;
  scanf("%d%d",&r,&c);
  int mat[r][c],mat1[r][c],res[i][j];
  for (i = 0; i < r; i++)
  {
     for (j = 0; j < c; j++)
     { 
       scanf("%d", &mat[i][j]);
     }
  }
  for (i = 0; i < r; i++)
  {
     for (j = 0; j < c; j++)
     { 
       scanf("%d", &mat1[i][j]);
     }
  }
   for (i = 0; i < r; i++)
  {
     for (j = 0; j < c; j++)
     { 
       res[i][j]=mat[i][j]-mat1[i][j];
       printf("%d ",res[i][j]);
     }
     printf("\n");
  }
return 0;
}