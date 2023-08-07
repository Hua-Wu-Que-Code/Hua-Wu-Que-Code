//
// Created by 花无缺 on 2023/8/5.
//
#include <stdio.h>
#define N 10
void main() {
    int i,j,a[N],temp;
    for (i=0;i<N;i++) {
        scanf("%d",&a[i]);

    }
    for (i=0,j=N-1;i<j;i++,j--) {
        temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }
    for (i=0;i<N;i++) {
        printf("%2d",a[i]);
    }
}