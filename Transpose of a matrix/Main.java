#include<stdio.h>
int main()
{
int i,j,r,c;
  scanf("%d%d",&r,&c);
  int mat[r][c],tra[c][r];
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
       tra[j][i]=mat[i][j];
     }
  }
   for (i = 0; i < c; i++)
  {
     for (j = 0; j < r; j++)
     { 
       printf("%d ",tra[i][j]);
     }
     printf("\n");
  }
return 0;
}
