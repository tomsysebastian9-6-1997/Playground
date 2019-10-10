// INCLUDE HEADER FILES NEEDED BY YOUR PROGRAM
// SOME LIBRARY FUNCTIONALITY MAY BE RESTRICTED
// DEFINE ANY FUNCTION NEEDED
// FUNCTION SIGNATURE BEGINS, THIS FUNCTION IS REQUIRED
#include <stdio.h>
#include<string.h>
int main()
{
 char str[100];
  int l,i,stat[100],c=0,n=0,s=0;
  scanf("%[^\n]s",str);
   l=strlen(str);
   for(i=0;i<=25;i++)
  {
    stat[i]=0;
  }
  for(i=0;i<l;i++)
  {
    if(str[i]>='a'&&str[i]<='z')
    {
      c=str[i]-'a';
      stat[c]++;
     }
    else if(str[i]>='A'&&str[i]<='Z')
    {
      c=str[i]-'A';
      stat[c]++;
    }
  }
  for(i=0;i<=25;i++)
  {
     // printf("%d\t",stat[i]);
    if(stat[i]>0)
    {
     printf("%c%d ",(i+'a'),stat[i]);
    }
   
  }
   return 0;
}