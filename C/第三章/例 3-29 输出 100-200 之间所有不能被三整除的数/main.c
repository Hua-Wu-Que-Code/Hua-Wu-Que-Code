//
// Created by 花无缺 on 2023/8/2.
//
#include <stdio.h>
#include <math.h>

void main() {
    int i;
    for ( i = 100; i <= 200;i++) {
        if(i%3==0) continue;
        printf("%5d",i);
    }
}