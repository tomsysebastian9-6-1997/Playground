#include<stdio.h>
int main()
{
  int n,x,r;
  scanf("%d",&n);
  x=n%100;
  r=x/10;
  printf("%d",r);
  return 0;
}