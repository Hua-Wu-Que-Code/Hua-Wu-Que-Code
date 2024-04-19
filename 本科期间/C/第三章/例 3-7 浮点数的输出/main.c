//
// Created by 花无缺 on 2023/8/2.
//
#include <stdio.h>

void main() {
    float a = 1999.01033;
    float b = 10000.0;
    double c = 1999.01033;
    printf("f 格式:%f \n",a);
    printf("f 格式:%f \n",c);
    printf("g 格式:%g \n",a);
    printf("e 格式:%e \n",a);
    printf("e 格式:%.2e \n",b);
    printf("f 格式:%10.2f \n",a);
    printf("g 格式:%10.2g \n",a);
    printf("e 格式:%10.2e \n",a);

}