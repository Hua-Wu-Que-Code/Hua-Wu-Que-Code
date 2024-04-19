//
// Created by 花无缺 on 2023/8/12.
//
#include <stdio.h>
#include <stdlib.h>

void main(int argc,char* argv[]) {
    char ch;
    FILE *fr,*fw;
    if (argc !=3) {
        printf("parameter error\n");
        exit(1);
    }
    if((fr = fopen(argv[1], "r"))==NULL) {
        printf("can not open %s",argv[1]);
        exit(1);
    }
    if((fw = fopen(argv[2], "w"))==NULL) {
        printf("can not open %s",argv[2]);
        exit(1);
    }
    while(!feof(fr)) {
        fputc(fgetc(fr),fw);
    }
    fclose(fr);
    fclose(fw);
}