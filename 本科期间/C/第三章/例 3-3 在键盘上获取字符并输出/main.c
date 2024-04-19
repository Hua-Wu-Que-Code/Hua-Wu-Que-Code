//
// Created by 花无缺 on 2023/8/2.
//
#include <stdio.h>
#include <string.h>
void fun(int *p,int n) {
    int i,k,j,t;
    for (i = 0;i < n;i++) {
        k = i;
        for (j = i+1;j<n;j++) {
            if ( *(p+j) > *(p+k)) {
                t = *(p+j);
                *(p+j) = *(p+k);
                *(p+k) = t;
            }
        }
    }
}

void printfArr(int * pa,int n) {
    for (int j = 0;j<n;j++) {
        printf("%3d",* (pa+j));
    }
    printf("\n");
}

void main() {
    int arr[10] = {0,1,2,3,4,5,6,7,8,9};
    int n = sizeof arr / sizeof arr[0];
    printfArr(arr, n);
    fun(arr,n);
    printfArr(arr, n);
}