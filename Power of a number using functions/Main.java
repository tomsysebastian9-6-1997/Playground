# include<stdio.h>
# include<math.h>
int power(int n1,int n2);
 int main(){
    // Type your code here
  int n1,n2;
  scanf("%d%d",&n1,&n2);
   int op=power(n1,n2);
  printf("%d",op);
}
int power(int a,int b)
{
  int s;
  s=pow(a,b);
  	return s;
}