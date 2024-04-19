//
// Created by 花无缺 on 2023/8/13.
//
#include <stdio.h>
#include <stdlib.h>

void main() {
    char c1 = 'A',c2,s1[10] = {"Program"},s2[10];
    int i1=168,i2;
    float f1=95.56,f2;
    FILE *fp;
    if ((fp= fopen("/Users/huawuque/CLionProjects/Hua-Wu-Que-Code/C/第八章/abc.txt","w"))==NULL) {
        printf("Can not open file\n");
        exit(1);
    }
    printf("%c,%d,%7.2f,%s\n",c1,i1,f1,s1);
    fprintf(fp,"%c,%d,%7.2f,%s\n",c1,i1,f1,s1);
    fclose(fp);
    if ((fp= fopen("/Users/huawuque/CLionProjects/Hua-Wu-Que-Code/C/第八章/abc.txt","r"))==NULL) {
        printf("Can not open file\n");
        exit(1);
    }
    fscanf(fp,"%c,%d,%f,%s",&c2,&i2,&f2,s2);
    printf("%c,%d,%7.2f,%s\n",c2,i2,f2,s2);
    fclose(fp);
}