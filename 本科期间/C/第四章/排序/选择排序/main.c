//
// Created by 花无缺 on 2023/8/5.
//
#include <stdio.h>
#define N 10
void main() {
    int i,j,a[N],t;
    for ( i = 0; i < N; ++i) {
        scanf("%d",&a[i]);
    }
    for (i = 0; i < N-1; ++i) {
        for (j=N-1;j>=1;j--) {
            if(a[j]>a[j-1]) {
                t = a[j];
                a[j] = a[j-1];
                a[j-1] = t;
            }
        }
    }
    for ( i = 0; i < N; ++i) {
        printf("%2d",a[i]);
    }
}