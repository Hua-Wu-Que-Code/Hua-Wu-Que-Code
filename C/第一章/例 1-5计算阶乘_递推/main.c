//
// Created by 花无缺 on 2023/7/31.
//
#include <stdio.h>

void main() {
    int m,t = 1,i = 1;
    scanf("%d",&m);
    while (i <= m) {
        t = t * i;
        i++;
    }
    printf("%d的阶乘是%d",m,t);
}