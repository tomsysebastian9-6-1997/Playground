#include <stdio.h>
int main() {
	int n,a,s;
  scanf("%d",&n);
  a=n%10;
  while(n>10)
  {
    n=n/10;
    }
  s=n+a;
  printf("%d",s);
	return 0;
}