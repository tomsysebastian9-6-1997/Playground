#include<stdio.h>
int main()
{
  //Type your code here
  int n;
  scanf("%d",&n);
  int a[n];
  for(int i=0;i<n;i++)
  {
    scanf("%d",&a[i]);
  }
  for(int i=0;i<n;i++)
  {
    if(a[i]>0)
    {
      printf("%d ",a[i]);
    }
  }
  for(int i=0;i<n;i++)
  {
    if(a[i]==0)
    {
      printf("%d ",a[i]);
    }
  }
  return 0;
}