#include<stdio.h>
int main()
{
	int n;
  scanf("%d",&n);
  int arr[n],temp,i,j;
  for(i=0;i<n;i++)
  {
    scanf("%d",&arr[i]);
  }
  int s=n/2;
  for(i=0;i<s;i++)
  {
    for(j=i+1;j<s;j++)
    {
      if(arr[i]>arr[j])
      {
    	temp=arr[j];
    	arr[j]=arr[i];
   	 	arr[i]=temp;
      }
    }
  }
  for(i=0;i<n;i++)
  {
    printf("%d ",arr[i]);
  }
	return 0;
}