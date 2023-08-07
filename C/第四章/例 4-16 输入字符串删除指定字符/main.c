//
// Created by 花无缺 on 2023/8/5.
//
#include <stdio.h>
#include <string.h>
#define N 5
void main() {
    char str[256],prior,str1[10],str2[10];
    int i,j=0;
    printf("请输入一个英语句子");
    gets(str);
    printf("%s\n",str);
    scanf("%c",&prior);
    for (i=0;i < strlen(str);i++) {
        if(str[i] != prior) {
            str1[j++] = str[i];
        }
    }
    puts(str1);
}