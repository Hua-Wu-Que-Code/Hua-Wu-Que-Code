//
// Created by 花无缺 on 2023/8/7.
//
#include <stdio.h>

void main() {
    char a[5] = "1234";
    short *p;
    p = (short* ) a;
    printf("%d\n",*p);
    p++;
    printf("%d\n",*p);
}