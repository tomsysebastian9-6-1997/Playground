#include<stdio.h>
int main()
{
  //Type your code here
  int y;
  scanf("%d",&y);
  if((y%4 == 0)||(y%400 == 0)&&(y%100 == 0))
  {
    printf("Leap year");
  }
  else
  {
    printf("Not Leap year");
  }
  return 0;
}