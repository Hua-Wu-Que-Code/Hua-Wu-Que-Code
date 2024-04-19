//
// Created by 花无缺 on 2023/8/2.
//
#include <stdio.h>

void main() {
    int a = 10;
    int * pa;
    pa = &a;
    printf("%d\n",a);
    printf("%#o\n",a);
    printf("%#x\n",a);
    printf("%p\n",a);
    printf("%x\n",pa);
    printf("%d\n",*pa);
}