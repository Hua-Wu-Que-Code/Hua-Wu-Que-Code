#include <stdio.h>
#include <math.h>
#define N 20
void inputArr(int a[],int n) {
    for (int i = 0; i <n; ++i) {
        scanf("%d",a+i);
    }
}
void outPutArr(int a[],int n){
    for (int i = 0; i <n; ++i) {
        printf("%3d",a[i]);
    }
    printf("\n");
}
void bubbleSort(int a[],int n){
    int i,j,k,t;
    for (i = 0; i <n; ++i) {
        k=i;
        for (j = i+1; j <n; ++j) {
            if(a[j]>a[i]) {
                t = a[j];
                a[j] = a[k];
                a[k] = t;
            }
        }
    }
}
void insert(int a[]) {
    int n = sizeof a / sizeof a[0] - 1;
    printf("%d",n);
    scanf("%d",a+n);
    bubbleSort(a,10);
}
int main() {

    int n,a[N];
    inputArr(a,10);
    outPutArr(a,10);
    bubbleSort(a,10);
    insert(a);
    outPutArr(a,11);
}
