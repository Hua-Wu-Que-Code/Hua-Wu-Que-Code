#include <stdio.h>

int main() {
	int headNum,footNum,rabbit,chicken;
	printf("请输入头的个数\n");
	scanf("%d",&headNum);
	printf("请输入脚的个数\n");
	scanf("%d",&footNum);
	for (rabbit = 1;rabbit <= headNum;rabbit ++) {
		chicken = headNum - rabbit;
		if ( rabbit * 4 + chicken * 2 == footNum ) {
			printf("兔子的个数是:%d\n",rabbit);
			printf("鸡的个数是:%d\n",chicken);
		}
	}
	return 0;
}