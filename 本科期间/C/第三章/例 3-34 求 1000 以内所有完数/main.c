//
// Created by 花无缺 on 2023/8/2.
//
#include <stdio.h>
#include <stdlib.h>
#include <time.h>
#include <math.h>

void main() {
    int m,s,j;
    for (m=2;  m<=1000 ; m++) {
        s=1;
        for (j = 2; j <=m/2 ; j++) {
            if (m%j == 0) s=s+j;
        }
        if (m==s) {
            printf("%d是完数\n",m);
        }
    }
}