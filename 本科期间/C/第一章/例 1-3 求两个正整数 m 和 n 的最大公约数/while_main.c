//
// Created by 花无缺 on 2023/7/31.
//
#include <stdio.h>

void main() {
    int m,n,r;
    scanf("%d,%d",&m,&n);
    r = m % n;
    while (r) {
        m = n;
        n = r;
        r = m % n;
    }
    printf("最大公约数是:%d",n);
}