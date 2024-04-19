//
// Created by 花无缺 on 2023/8/12.
//
#include <stdio.h>
#include <math.h>
int ISPrime(int n) {
    if (n<=1) return 0;
    else if (n<=3) return 1;
    for (int i =2;i<=sqrt(n);i++) {
        if(n%i==0) return 0;
    }
    return 1;
}
void main() {
    for (int i =0;i<100;i++) {
        if(ISPrime(i)) printf("%d是素数\n",i);
        else printf("%d不是素数\n",i);
    }
}