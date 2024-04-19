//
// Created by 花无缺 on 2023/8/12.
//
#include <stdio.h>
#include <stdlib.h>
#define N 81
void main() {
    char str1[N],str2[N],str3[N] = {"fuck","you"};
    fputs(str3,stdout);
    int i;
    FILE *fp;
    if ((fp=fopen("/Users/huawuque/CLionProjects/Hua-Wu-Que-Code/C/第八章/abc.txt","w"))==NULL) {
        printf("can not open the file\n");
        exit(1);
    }
    for(i=0;i<3;i++) {
        gets(str1);
        fputs(str1,fp);
        fputs("\n",fp);
    }
    fclose(fp);
    if ((fp=fopen("/Users/huawuque/CLionProjects/Hua-Wu-Que-Code/C/第八章/abc.txt","r"))==NULL) {
        printf("can not open the file\n");
        exit(1);
    }
    for(i=0;i<3;i++) {
        fgets(str2,N,fp);
        fputs(str2,stdout);
    }
}