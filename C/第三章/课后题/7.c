//
// Created by 花无缺 on 2023/8/12.
//
#include <stdio.h>
#include <math.h>

void main() {
    float a,b,c,x1,x2,p;
    scanf("%f%f%f",&a,&b,&c);
    if(a==0) printf("%f",-c/b);
    else if (b*b-4*a*c >0) {
        p = sqrt(b*b-4*a*c);
        x1 = (-b+p) /2*a;
        x2 = (-b-p) /2*a;
        printf("%f,%f",x1,x2);
    }
    else if (b*b-4*a*c == 0) {
        x1 = -b/2*a;
        printf("%f",x1);
    }
    else printf("没有实数根");
}