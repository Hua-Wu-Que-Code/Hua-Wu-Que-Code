//
// Created by 花无缺 on 2023/8/5.
//
#include <stdio.h>
#include <string.h>
#define N 5
void main() {
    char str[] = "hello";
    char t;
    int len = strlen(str) - 1;
    for (int i = 0; i < len; ++i,len--) {
        t = str[i];
        str[i] = str[len];
        str[len] = t;
    }
    printf("%s",str);
}