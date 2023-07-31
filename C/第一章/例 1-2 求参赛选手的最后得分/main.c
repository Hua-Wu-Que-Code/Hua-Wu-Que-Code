//
// Created by 花无缺 on 2023/7/31.
//
#include <stdio.h>

void main() {
    float s[10],max,min,ave,sum;
    int i;
    max = min = sum = 0;
    for(i = 0;i<10;i++) {
        scanf("%f",&s[i]);
        max = max > s[i] ? max : s[i];
        min = min > s[i] ? s[i] : min;
        sum += s[i];
    }
    ave = (sum - max -min) / 8;
    printf("score is %f",ave);
}