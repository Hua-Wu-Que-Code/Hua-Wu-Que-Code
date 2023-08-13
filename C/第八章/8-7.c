//
// Created by 花无缺 on 2023/8/13.
//
#include <stdio.h>
#include <stdlib.h>
#define N 2
struct staff {
    char name[11];
    int salary;
    int cost;
};

void main() {
    struct staff worker;
    int i;
    FILE *fp;
    if ((fp=fopen("/Users/huawuque/CLionProjects/Hua-Wu-Que-Code/C/第八章/wage.dat","wb+"))==NULL) {
        printf("can not open file\n");
        exit(1);
    }
    for(i=0;i<N;i++) {
        printf("请输入第%d 名员工的姓名 收入 支出:\n",i+1);
        scanf("%s%d%d",&worker.name,&worker.salary,&worker.cost);
        fwrite(&worker,sizeof(struct staff),1,fp);
    }
    rewind(fp);
    for(i=0;i<N;i++) {
        fread(&worker,sizeof(struct staff),1,fp);
        printf("%s,%d,%d\n",worker.name,worker.salary,worker.cost);
    }
}