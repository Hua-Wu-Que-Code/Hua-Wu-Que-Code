//
// Created by 花无缺 on 2023/8/2.
//
#include <stdio.h>
#include <stdlib.h>
#include <time.h>

void main() {
    long int magic,guess,n=0;
    srand(time(NULL));
    magic = rand();
    printf("%d\n",magic);
    guess = magic -1;
    while(magic!=guess) {
        printf("Please guess the magic number");
        scanf("%d",&guess);
        n++;
        if (guess>magic) printf("wrong!too high\n");
        else if(guess<magic) printf("Wrong!too low\n");
    }
    printf("Ok\n");
    printf("你猜了%d 次\n",n);
}