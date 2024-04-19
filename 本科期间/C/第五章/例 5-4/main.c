//
// Created by 花无缺 on 2023/8/7.
//
#include <stdio.h>

void main() {
    int a[10],i;
    for (i = 0;i< 10;i++) {
        scanf("%d",&a[i]);
    }
    int *p = a;
    for (;p<(a+10);p++) {
        printf("%d",*p);
    }
}