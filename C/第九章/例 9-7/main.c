//
// Created by 花无缺 on 2023/8/9.
//
#include <stdio.h>
#define LEAP(Y) (Y)%4==0&&(Y)%100!=0||(Y)%400==0

void main() {
    int year;
    scanf("%d",&year);
    if(LEAP(year)) printf("%d是闰年",year);
    else printf("%d不是闰年",year);
}