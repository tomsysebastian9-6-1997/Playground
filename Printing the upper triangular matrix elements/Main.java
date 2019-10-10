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
for(k = 0; k < c; k++)
        {
              
  for(i = 0, j = k; j < c ; i++, j++)
            printf("%d ", mat[i][j]);
        }
 return 0;
}