#include <stdio.h>
int main()
{
	int n;
	scanf("%d", &n);
	int temp = n;
	int sum = 0,rem=0;
	while(n > 0)
	{
	     rem = n % 10;
	   int c = 1;
	    for(int i = 1; i <= rem; i++) 
	    {
	        c = c * i;
	    }
	    sum = sum + c;
	    n = n / 10;
	}
	if(temp == sum)
	{
	    printf("Yes");
	}
	else
	{
	    printf("No");
	}
	return 0;
}