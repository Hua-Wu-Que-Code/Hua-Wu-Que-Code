//
// Created by 花无缺 on 2023/8/5.
//
#include <stdio.h>
#define N 10
void main() {
    int a[3][3] = {{1,2,3},{1,2,3},{1,2,3}};
    int b[3][3] = {{1,2,3},{1,2,3},{1,2,3}};
    int i,j;
    for(i=0;i<3;i++) {
        for (j=0;j<3;j++) {
            a[i][j] += b[i][j];
            printf("%4d",a[i][j]);
        }
        printf("\n");
    }
}