//
// Created by 花无缺 on 2023/6/24.
//

#include <stdio.h>

int main() {
    int n,t,i;
    printf("please input a positive integer:");
    scanf("%d",&n);
    t = i = 1;
    while(i<=n) {
        t=t*i;
        i+=1;
    }
    printf("n's factorial is %d",t);
    return 0;
}