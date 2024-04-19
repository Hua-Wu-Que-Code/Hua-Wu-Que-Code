//
// Created by 花无缺 on 2023/8/12.
//
#include <stdio.h>

void main() {
    int m ,s=0;
    scanf("%d",&m);
    while(m!=0) {
        s+=m%10;
        m /= 10;
    }
    printf("%d",s);
}