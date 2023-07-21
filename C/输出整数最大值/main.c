//
// Created by 花无缺 on 2023/6/30.
//

#include <stdio.h>

int max(int,int);

int main () {
    int a,b,c;
    scanf("%d,%d",&a,&b);
    c = max(a,b);
    printf("%d",c);
    return 0;
}

int max(int x,int y) {
    return x > y ? x : y;
}
