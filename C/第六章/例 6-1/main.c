//
// Created by 花无缺 on 2023/8/8.
//
#include <stdio.h>
int fac(int n) {
    int t = 1,i;
    for (i = 1; i <=n; i++) {
        t *= i;
    }
    return t;
}
int con(int m,int n) {
    return fac(m) /(fac(n)* fac(m-n));
}
void main() {
    int m,n,c;
    scanf("%d%d",&m,&n);
    c = con(m,n);
    printf("%d",c);
}