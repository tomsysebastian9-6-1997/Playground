#include<stdio.h>
#include<stdlib.h>
void check_sum_and_display(int arr[], int size, int sum);
int main()
{
    // Get the size of an array
    int size, arr[50], i, sum;
    scanf("%d", &size);
    // Get the array elements
    for(i=0; i<size; i++)
    {
        scanf("%d", &arr[i]);
    }
    
    // Get the sum value (to check with an array elements)
    scanf("%d", &sum);
  	// Function call to check the sum of any two elements in an array equal to given sum 
  	// and display the same
    check_sum_and_display(arr, size, sum);
    return 0;
}

void check_sum_and_display(int arr[], int size, int sum)
{
  // Type your code here
  int a,i,j,flag=0, tot=0;
  for(i=0;i<size;i++)
  {
    for(j=i+1;j<size;j++)
    {
      tot=arr[i]+arr[j];
      if(tot==sum)
      {
        printf("Perfect couple: %d %d",arr[i],arr[j]);
        flag=1;
         break;
      }
     }
  } 
  if(flag!=1)
  {
    printf("No perfect couple found!");
  }
 }