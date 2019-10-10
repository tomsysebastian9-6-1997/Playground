#include <stdio.h>
int main()
{
   int n,i,j;
  scanf("%d",&n);
  int arr[n];
  for(i=0;i<n;i++)
  {
  scanf("%d",&arr[i]);
  }
  for(i=1;i<=n;i++)
  {
    int f=0;
    for(j=0;j<n;j++)
    {
    if(arr[j]==i)
    {
      f=1;
      break;
    }
    }
  
 if(f==0)
 {
   printf("%d",i);
 }
  }
   return 0;
}