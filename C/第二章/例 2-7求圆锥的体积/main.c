//
// Created by 花无缺 on 2023/7/31.
//

#include <stdio.h>
#define PI 3.14
#define Radius(R) (R)*(R)

void main() {
    float R,V;
    scanf("%f",&R);
    V = PI * Radius(R) / 3;
    printf("%f",V);
}