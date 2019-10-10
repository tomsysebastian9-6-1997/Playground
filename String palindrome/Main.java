#include<stdio.h>
#include<string.h>
int main()
{
 char str[10];
  int l,i,j=0,f;
  scanf("%s",str);
  l=strlen(str);
  for(i=0;i<l;i++)
  { 
     f=0;
    if(str[i]!=str[l-i-1])
    {
      f=1;
      break;
    }
  }
   if(f==0)
    {
    printf("%s is a palindrome",str);
    }
    else
    {
      printf("%s is not a palindrome",str);
    }
  
  
  return 0;
}