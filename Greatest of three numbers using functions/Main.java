#include <stdio.h>
int great(int n1,int n2);
int main(){
	// Type your code here
  int n1,n2,n3;
  scanf("%d%d%d",&n1,&n2,&n3);
  int c=great(n1,n2);
  int d=great(c,n3);
  printf("%d",d);
}
int great(int x,int y)
{
  if(x>y)
  {
    return x;
  }
  else
  {
    return y;
}
}