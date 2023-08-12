//
// Created by 花无缺 on 2023/8/12.
//
#include <stdio.h>

void main() {
    char ch;
    FILE *fp;
    if((fp=fopen("/Users/huawuque/CLionProjects/Hua-Wu-Que-Code/C/第八章/abc.txt","w"))==NULL) {
        printf("Can not open file\n");
    }
    ch = getchar();
    while(ch!=EOF) {
        fputc(ch,fp);
        ch = getchar();
    }
    fclose(fp);
}