//
// Created by 花无缺 on 2023/8/7.
//
#include <stdio.h>

void main() {
    int x[3][4] = {{0,1,2,3},{4,5,6,7},{8,9,10,11}};
    for (int i = 0;i<3;i++) {
        for (int j =0;j<4;j++) {
            printf("%3d",*(x[i]+j));
        }
        printf("\n");
    }
    printf("**************\n");
    int *p = &x[0][0];
    for (int i = 0;i<3;i++) {
        for (int j =0;j<4;j++) {
            printf("%3d",*p++);
        }
        printf("\n");
    }
}