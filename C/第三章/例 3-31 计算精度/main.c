//
// Created by 花无缺 on 2023/8/2.
//
#include <stdio.h>
#include <stdlib.h>
#include <time.h>
#include <math.h>

void main() {
    double x0,x1;
    x0 = 2;
    x1 = (2*x0*x0*x0+5) / (3*x0*x0-2);
    while ( fabs(x1-x0) >= 1e-6 ) {
        x0 = x1;
        x1 = (2*x0*x0*x0+5) / (3*x0*x0-2);
    }
    printf("the root is %f",x1);
}