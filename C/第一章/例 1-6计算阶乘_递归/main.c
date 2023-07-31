//
// Created by 花无缺 on 2023/7/31.
//
#include <stdio.h>

int fun(int m) {
    if (m == 1 || m ==0) return 1;
    else return m*fun(m-1);
}

void main() {
    printf("%d", fun(2));
}