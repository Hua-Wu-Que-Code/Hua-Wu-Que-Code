//
// Created by 花无缺 on 2023/6/24.
//
#include <stdio.h>

int main() {
    int n;
    int x = 1;
    printf("请输入一个正整数:\n");
    scanf("%d",&n);
    while(x<= n && x*x*x != n) {
        x++;
    }
    if(x<=n) printf("i find it: %d",x);
    else printf("wtf,how dare you !!! your motherfucker.");
    return 0;
}