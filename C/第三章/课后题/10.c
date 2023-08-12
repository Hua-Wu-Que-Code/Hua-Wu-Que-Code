//
// Created by 花无缺 on 2023/8/12.
//
#include <stdio.h>

void main() {
    int m,n,r,min,max;
    scanf("%d,%d",&m,&n);
    r = m%n;
    while(r) {
        m = n;
        n = r;
        r = m % n;
    }
    min = n;
}