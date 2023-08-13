//
// Created by 花无缺 on 2023/8/13.
//
#include <stdio.h>
#include <stdlib.h>
#define N 5
#define M 10
void main() {
    float s[M],max,min,sum,ave;
    int i,j;
    FILE *fp;
    if ((fp=fopen("/Users/huawuque/CLionProjects/Hua-Wu-Que-Code/C/第八章/score.dat","wb"))==NULL) {
        printf("can not open file\n");
        exit(1);
    }
    for (i=0;i<N;i++) {
        printf("输入第%d个选手的的%d 个评委分\n",i+1,M);
        for (j=0;j<M;j++) {
            scanf("%f",&s[j]);
        }
        fwrite(s,sizeof(float),M,fp);
    }
    fclose(fp);
    if ((fp=fopen("/Users/huawuque/CLionProjects/Hua-Wu-Que-Code/C/第八章/score.dat","rb"))==NULL) {
        printf("can not open file\n");
        exit(1);
    }
    for(i=0;i<N;i++) {
        fread(s,sizeof(float),M,fp);
        max=min=sum=s[0];
        for (j=1;j<M;j++) {

        }
    }
    fclose(fp);
}