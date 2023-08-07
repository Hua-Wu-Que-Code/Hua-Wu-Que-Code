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

    for (i=0;i<N-1;i++) {
        j = i;
        for (int k = i+1; k < N; ++k) {
            if (a[k]>a[j]) j = k;
        }
        if (j!=i) {
            t = a[j];
            a[j] = a[i];
            a[i] = t;
        }
    }
    for ( i = 0; i < N; ++i) {
        printf("%2d",a[i]);
    }
}