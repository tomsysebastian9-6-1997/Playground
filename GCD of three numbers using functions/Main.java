#include <stdio.h>
int great(int n1,int n2,int n3);
int main() {
	//Type your code here
  int n1,n2,n3;
  scanf("%d%d%d",&n1,&n2,&n3);
 // int c = great(n1,n2);
 // int d = great(c,n3);
  int op=great(n1,n2,n3);
  printf("%d",op);
  return 0;
}
int great(int a,int b,int c)
{
  int v,min;
  if((a>b)&&(a>c))
  {
     min=a;
  }
  else if(b>c)
  {
    min=b;
  }
  else
  {
    min=c;
  }
  while(min>=1)
  {
    if((a%min==0)&&(b%min==0)&&(c%min==0))
    {
      return min;
      break;
    }
    min--;
  }
	return v;
}