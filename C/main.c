#include <stdio.h>

int main() 
{
	int s[3],i,max;
	max = 0;
	for(i=0;i<3;i++)
	{
		scanf("%d",&s[i]);
		if(max <= s[i]) max = s[i];
	}
	printf("最大值是:%d",max);
	return 0;
}