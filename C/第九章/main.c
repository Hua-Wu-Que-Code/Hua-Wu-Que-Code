//
// Created by 花无缺 on 2023/8/10.
//
#include <stdio.h>
#include <math.h>

void main() {
    double  x = 0.001,y,step = 0.001;
    for (; x < 1; x+=step) {
        for (y=0.001;x*x+y*y<=1;y+=step) {
            if(sqrt(x*x+y*y) < x*x+y*y)
            {
                printf("find it\n");
                printf("%f,%f\n",x,y);
            }
        }
    }
}
