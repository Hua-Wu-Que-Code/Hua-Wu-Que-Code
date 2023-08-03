//
// Created by 花无缺 on 2023/8/2.
//
#include <stdio.h>

void main() {
    int a,d,n,s;
    scanf("%d%d%d",&a,&d,&n);
    s = n*a + n*(n-1)*d/2;
    printf("%d",s);
}