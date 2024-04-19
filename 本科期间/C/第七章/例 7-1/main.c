//
// Created by 花无缺 on 2023/8/11.
//
#include <stdio.h>
typedef struct{
    float real;
    float imag;
}complex;

void main() {
    complex x,y,s,p;
    scanf("%f,%f",&x.real,&x.imag);
    scanf("%f,%f",&y.real,&y.imag);
    s.real = x.real+y.real;
    s.imag = x.imag+y.imag;
    p.real = x.real*y.real - x.imag*y.imag;
    p.imag = x.real*y.imag+y.real*x.imag;
    printf("两复数和是: %.2f+%.2fi\n",s.real,s.imag);
    printf("两复数积是: %.2f+%.2fi\n",p.real,p.imag);
}