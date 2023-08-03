//
// Created by 花无缺 on 2023/8/2.
//
#include <stdio.h>
#include <math.h>

void main() {
    float a,b,c,s,disc,p,q,x1,x2;
    printf("Input a,b,c:");
    scanf("%f%f%f",&a,&b,&c);
    disc = b*b-4*a*c;
    p= -b / (2*a);
    q = sqrt(disc) / (2*a);
    x1 = p + q;
    x2 = p - q;
    printf("x1 = %5.2f\nx2 = %5.2f\n",x1,x2);
}