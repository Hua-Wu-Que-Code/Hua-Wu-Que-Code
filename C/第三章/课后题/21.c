//
// Created by 花无缺 on 2023/8/12.
//
#include<stdio.h>
#define N 7
void main()
{	int i,j,k;
    for(i=-N/2;i<=N/2;i++)
    {
        // 根据 i 的值计算出当前行的星号数量 k
        k=i<0?N+i*2:N-i*2;
        // 根据星号数量 k 和常数值 10 进行排版，输出适当数量的空格
        for(j=1;j<10-k/2;j++)
            printf(" ");
        for(j=1;j<=k;j++)
            printf("*");
        printf("\n");
    }
}