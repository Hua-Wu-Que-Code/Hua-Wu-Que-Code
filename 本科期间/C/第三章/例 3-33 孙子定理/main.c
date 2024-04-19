//
// Created by 花无缺 on 2023/8/2.
//
#include <stdio.h>
#include <stdlib.h>
#include <time.h>
#include <math.h>

void main() {
    int i,m;
    do {
        i++;
        if (i%3==2&&i%5==3&&i%7==2) m=1;
    } while (m!=1);
    printf("%d",i);
}