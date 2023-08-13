//
// Created by 花无缺 on 2023/8/12.
//
#include <stdio.h>

void main() {
    char ch;
    FILE *fp;
    if((fp=fopen("/Users/huawuque/CLionProjects/Hua-Wu-Que-Code/C/第八章/abc.txt","r"))==NULL) {
        printf("Can not open file\n");
    }
    ch = fgetc(fp);
    while(ch!=EOF) {
        putchar(ch);
        ch = fgetc(fp);
    }
    fclose(fp);
}