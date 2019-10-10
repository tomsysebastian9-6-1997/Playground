#include <stdio.h>
int main(){
	// Type your code here
  int n,x=0;
  scanf("%d",&n);
  for(int i=1;i<=n;i++)
  {
    for(int j=1;j<=i;j++)
    {
      if(x==0)
      {
        printf("*");
        x=1;
      }
      else
      {
        printf("#");
        x=0;
      }
    }
      printf("\n");
    }
  	return 0;
}