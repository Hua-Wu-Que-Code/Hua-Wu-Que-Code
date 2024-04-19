//
// Created by 花无缺 on 2023/8/5.
//
#include <stdio.h>
#include <string.h>
#define N 5
void main() {
    char str[256],prior = ' ';
    int i,count = 0;
    printf("请输入一个英语句子");
    gets(str);
    printf("%s",str);
    for (i=0;i != strlen(str);i++) {
        if(prior == ' ' && (str[i] >= 'a' && str[i] <= 'z' || str[i] >= 'A' && str[i] <= 'Z')) {
            count++;
            printf("\n");
        }
        if (str[i] >= 'a' && str[i] <= 'z' || str[i] >= 'A' && str[i] <= 'Z') {
            printf("%c",str[i]);
        }
        prior = str[i];
    }
    printf("\n%d",count);
}