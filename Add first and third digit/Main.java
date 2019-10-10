#include<stdio.h>
int main()
{
 int num,res ,s;
  scanf("%d",&num);
    s = num % 10;
    num = num/ 100;
    res=num+s;
  printf("%d", res );
  return 0;
}