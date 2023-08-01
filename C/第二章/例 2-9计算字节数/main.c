//
// Created by 花无缺 on 2023/7/31.
//

#include <stdio.h>
#define PI 3.14
#define MAX(a,b) ( (a) > (b) ) ? (a) : (b)
#define MIN(a,b) ( (a) < (b) ) ? (a) : (b)

void main() {
    int x = 5;
    x = x+10+x*16;
    printf("%d\n", x);
}