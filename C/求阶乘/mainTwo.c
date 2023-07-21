//
// Created by 花无缺 on 2023/6/24.
//

#include <stdio.h>

int fun(int n) {
    if(n == 1 || n == 0) return 1;
    else return fun(n-1)*n;
}

int main() {
    int n,t;
    printf("please input a positive integer:");
    scanf("%d",&n);
    t = fun(n);
    printf("n's factorial is %d",t);
    return 0;
}
