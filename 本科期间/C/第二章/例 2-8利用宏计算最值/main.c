//
// Created by 花无缺 on 2023/7/31.
//

#include <stdio.h>

void main() {
    float f;
    double d;
    long double ld;
    int a[10];
    char str[] = "hello";
    printf("The char is %d\n",sizeof(char));
    printf("The float is %d\n",sizeof(f));
    printf("The double is %d\n",sizeof(d));
    printf("The long double is %d\n",sizeof(ld));
    printf("The long double is %d\n",sizeof(long double));
    printf("The int is %d\n",sizeof(int));
    printf("The int is %d\n",sizeof(a));
    printf("The short is %d\n",sizeof(short ));
    printf("The long is %d\n",sizeof(long));
    printf("The string is %d\n",sizeof(str));
}