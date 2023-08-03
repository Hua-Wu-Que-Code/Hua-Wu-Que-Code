//
// Created by 花无缺 on 2023/8/2.
//
#include <stdio.h>
#include <math.h>

void main() {
    int i;
    printf("\t");
    for (i=0;i<=9;i++) printf("%4d",i);
    printf("\n------------------------------------------------\n");
    for (int j = 0; j <= 9 ; j++) {
        printf("%d\t");
        for (i=0;i<=9;i++) printf("%4d",i*j);
        printf("\n");
    }
}