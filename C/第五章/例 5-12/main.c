//
// Created by 花无缺 on 2023/8/7.
//
#include <stdio.h>

void main() {
    int i,j;
    int a[4][4],*p[4] = {a[0],a[1],a[2],a[3]};
    for (i=0;i<4;i++) {
        for (j=0;j<4;j++) {
            scanf("%d",p[i]+j);
        }
    }

    for (i=0;i<4;i++) {
        for (j=0;j<4;j++) {
            printf("%3d",*(p[i]+j));
        }
        printf("\n");
    }
}