//
// Created by 花无缺 on 2023/8/2.
//
#include <stdio.h>
#define PI 3.14

void main() {
    int degree;
    double radians;
    for (degree=0;degree<=360;degree+=90) {
        radians = (double) degree*PI / 180.0;
        printf("%d\t,%f\n",degree,radians);
    }

}