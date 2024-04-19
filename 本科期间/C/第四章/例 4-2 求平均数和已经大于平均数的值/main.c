//
// Created by 花无缺 on 2023/8/5.
//
#include <stdio.h>

void main() {
    int i,count = 0;
    float array[10],sum = 0,average;
    for ( i = 0; i < 10; ++i) {
        scanf("%f",&array[i]);
        sum += array[i];
    }
    average = sum / 10;
    for ( i = 0; i < 10; ++i) {
        if (array[i] > average) count++;
    }
    printf("%d",count);
}