//
// Created by 花无缺 on 2023/6/24.
// 欧几里得算法求最大公约数:同时能够整除 m 和 n 的最大正整数
// 用 n 除 m,并令 r 为所得余数 r=m mod n
// 若 r=0 算法结束; 若 r!=0,n->m,r->n
//

#include <stdio.h>

int main() {
    int m,n,r;
    printf("请输入两个正整数 m 和 n:");
    scanf("%d,%d",&m,&n);
    /*
    r = m%n;
    while (n) {
        m = n;
        n = r;
        r = m%n;
    }*/
    do {
        r = m % n;
        m = n;
        n = r;
    } while(r);
    printf("m 和 n的最大公约数就是:%d",m);
    return 0;
}