//
// Created by 花无缺 on 2023/7/31.
//

#include <stdio.h>
#define PI 3.14
#define MAX(a,b) ( (a) > (b) ) ? (a) : (b)
#define MIN(a,b) ( (a) < (b) ) ? (a) : (b)

void main() {
    unsigned int a =1;
    unsigned int result = ~a;
    printf("%d\n", sizeof(a));
    printf("%u\n", result);



    int num = 10;
    int left = num << 2;
    int right = num >> 2;
    printf("%d\n",left);
    printf("%d\n",right);
}