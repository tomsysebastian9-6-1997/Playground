#include <stdio.h>
int main() {
	int n;
  scanf("%d",&n);
  while(n>100)
  {
    n=n/10;
    }
  n=n%10;
  printf("%d",n);
	return 0;
}