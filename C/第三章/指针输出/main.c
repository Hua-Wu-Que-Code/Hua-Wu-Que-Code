//
// Created by 花无缺 on 2023/8/2.
//
#include <stdio.h>

int main() {

    int a = 1,*pa;
    //将指针 pa 指向 a
    pa = &a;
    //输出 a 的值
    printf("%d\n",a);
    //输出 a 的地址
    printf("%p\n",&a);
    //输出 pa 的值
    printf("%p\n",pa);

}