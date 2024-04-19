//
// Created by 花无缺 on 2023/8/2.
//
#include <stdio.h>
#include <math.h>

void main() {
    int x;
    scanf("%d",&x);
    x = x > 0 ? x : -x;
    printf("%d",x);
}