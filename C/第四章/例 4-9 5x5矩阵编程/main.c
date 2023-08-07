//
// Created by 花无缺 on 2023/8/5.
//
#include <stdio.h>
#define N 5
void main() {
    int a[N][N];
    int i,j;
    for (i=0;i<N;i++) {
        for (j=0;j<N;j++) {
            scanf("%d",&a[i][j]);
        }
    }
    int sum = 0,desSum = 0;
    for (i=0;i<N;i++) {
        for (j=0;j<N;j++) {
            if(i==j) sum += a[i][j];
            if (j<=i) desSum += a[i][j];
        }
    }
    printf("%d\n%d",sum,desSum);
}