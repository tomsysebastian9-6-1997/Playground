#include <stdio.h>
#include<math.h>
int main() {
	//Type your code
  int n,c=0,s=0;
  scanf("%d",&n);
  int copy=n;
  while(n!=0)
  {
    n=n/10;
    c++;
  }
  n=copy;
  for(int i=1;i<=c;i++)
  {
    int r=n%10;
    int p = pow(r,c);
    s=s+p;
    n=n/10;
  }
  if(s==copy)
  {
    printf("Armstrong Number");
  }
  else
  {
    printf("Not an Armstrong Number");
  }
	return 0;
}