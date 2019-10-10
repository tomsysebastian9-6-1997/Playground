#include<stdio.h>
int main()
{
  //Type your code here
  int n;
  scanf("%d",&n);
  int arr[n];
  for(int i=0;i<n;i++)
  {
    scanf("%d",&arr[i]);
  }
  int a,b;
  scanf("%d",&a);
  scanf("%d",&b);
  int x=-1,y=-1;
  for(int i=0;i<n;i++)
  {
    if(a==arr[i])
    {
      x=i;
    }
    else if(b==arr[i])
    {
      y=i;
    }
  }
 printf("%d\n",x);
  printf("%d",y);
  return 0;
}