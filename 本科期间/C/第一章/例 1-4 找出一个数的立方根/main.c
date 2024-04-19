//
// Created by 花无缺 on 2023/7/31.
//
#include <stdio.h>

void main(){
    int m,x=1;
    scanf("%d",&m);
    while(x <= m && x*x*x != m) x++;
    if ( x <=m ){
        printf("%d的立方根是%d",m,x);
    }
    else printf("%d没有立方根",m);
}