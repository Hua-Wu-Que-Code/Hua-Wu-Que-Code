//
// Created by 花无缺 on 2023/8/12.
//
#include <stdio.h>

void main() {
    char a[81];
    int i,j;
    gets(a);
    for (i=j=0;a[i]!='\0';i++)
        if(a[i]!='a')
            a[j++] = a[i];
    a[j]='\0';
    puts(a);
}