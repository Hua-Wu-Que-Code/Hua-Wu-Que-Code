//
// Created by 花无缺 on 2023/8/2.
//
#include <stdio.h>
#include <math.h>

void main() {
    int i,x,r,j;
    scanf("%d",&i);
    x = (int)sqrt(i);
    for (j = 2; j <= x ; j++) {
        if(i%j==0) break;
    }
    if (j>x) printf("是素数");
    else printf("不是素数");
}