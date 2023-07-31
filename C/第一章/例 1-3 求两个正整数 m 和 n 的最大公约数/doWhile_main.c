//
// Created by 花无缺 on 2023/7/31.
//
#include <stdio.h>

void main() {
    int m,n,r;
    scanf("%d,%d",&m,&n);
    do {
        r = m % n;
        m = n;
        n = r;
    } while (r);
    printf("最大公约数是:%d",m);
}