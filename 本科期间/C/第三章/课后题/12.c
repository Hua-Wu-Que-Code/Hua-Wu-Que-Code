//
// Created by 花无缺 on 2023/8/12.
//
#include <stdio.h>

void main() {
    double x=1,y=2,s=0;
    while(y<=21) {
        s += y/x;
        y+=x;
        x=y-x;
    }
    printf("%f",s);
}