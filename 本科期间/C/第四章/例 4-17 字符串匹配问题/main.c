//
// Created by 花无缺 on 2023/8/5.
//
#include <stdio.h>
#include <string.h>
#define N 30
void main() {
    char str1[N],str2[N];
    int i,j;
    gets(str1);
    gets(str2);
    i = 0,j = 0;
    while (str1[i] !='\0' && str2[j] != '\0') {
        if(str1[i] == str2[j]) {
            i++;
            j++;
        } else {
            i = i-j+1;
            j=0;
        }
    }
    if(str2[j] == '\0') printf("%d",i-j+1);
    else printf("fuck");
}