#include <stdio.h>
int main() {
    // Type your code here
  int n;
  scanf("%d",&n);
  for(int i=n;i>=1;i--)
  {
    int r = i;
      for(int j = 1 ; j <= i ; j++)
      {
        printf("%d",r);
        r--;
      }
    printf("\n");
  }
	return 0;
}