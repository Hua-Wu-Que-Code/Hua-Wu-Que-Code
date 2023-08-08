//
// Created by 花无缺 on 2023/8/8.
//
#include <stdio.h>
int fac(int n,int b) {
    return n*b;
}

void main() {
    int n=50,c;
    c = fac(n,++n);
    printf("%d",c);
}