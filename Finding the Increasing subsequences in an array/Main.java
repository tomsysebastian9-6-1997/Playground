#include <stdio.h>
int main()
{
   int n,i,j,s;
  scanf("%d",&n);
  int a[n];
  for(i=0;i<n;i++)
  {
    scanf("%d",&a[i]);
  }
  for(i=0;i<n;i++)
  {
  int s=a[i];
  for(j=i;j<n;j++)
  {
    if(s<a[j])
    {
      printf("%d,%d\n",s,a[j]);
    }
  }
  }
   return 0;
}