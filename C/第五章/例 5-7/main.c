//
// Created by 花无缺 on 2023/8/7.
//
#include <stdio.h>

void main() {
    int x[3][4] = {{0,1,2,3},{4,5,6,7},{8,9,10,11}};
    int (*p)[4];
    p = x;
    for (int i = 0;i<3;i++) {
        for (int j =0;j<4;j++) {
            printf("%3d",*(*p+j));
        }
        p++;
        printf("\n");
    }
}