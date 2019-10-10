#include<stdio.h>
int prime(int n);
int main(){
    // Type your code here
  int n;
  scanf("%d",&n);
  for(int i=2;i<=n;i++)
  {
    int flag = prime(i);
    if(flag==1)
    {
      printf("%d\n",i);
    }
  }
    return 0;
}
int prime(int x)
{
  int n=2,prime=1;
  while(n<=x/2)
  {
    if(x%n==0)
    {
      prime=0;
      break;
    }
    n++;
    
  }
    
return prime;
}