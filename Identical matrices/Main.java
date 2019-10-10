#include<stdio.h>
int main()
{
	int i,j,r,f,c,k;
  scanf("%d%d",&r,&c);
  int mat[r][c],mat1[r][c];
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
       if(mat[i][j]==mat1[i][j])
       {
         f=1;
       }
       else
       {
         f=0;
         break;
       }
     }
  }
  if(f==1)
  {
    printf("Yes");
  }
  else
  {
    printf("No");
  }
	return 0;
}