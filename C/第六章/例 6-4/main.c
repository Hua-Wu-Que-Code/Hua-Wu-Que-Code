  //
// Created by 花无缺 on 2023/8/8.
//
#include <stdio.h>
int p1(int a[100]){
    int i,p=1;
    for (i=0;i<10;i++) {
        p*=a[i];
    }
    return p;
}
int p2(int a[],int n){
    int i,p=1;
    for (i=0;i<n;i++) {
        p*=a[i];
    }
    return p;
}
int p3(int * arr,int n) {
    int i,p=1;
    for (i=0;i<n;i++) {
        p*=arr[i];
    }
    return p;
}


void main() {
    int a[10] = {1,2,3,4,5,6,7,8,9,10};
    int ps1,ps2,ps3;
    ps1 = p1(a);
    printf("%d\n",ps1);
    ps2 = p2(a,10);
    printf("%d\n",ps2);
    ps3 = p3(a,10);
    printf("%d\n",ps3);

}