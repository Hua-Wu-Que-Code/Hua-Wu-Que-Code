#include <stdio.h>
#include <math.h>
int fac2() {
    int y =1;
    y*=5;
    return y;
}
int fac1() {
    static int x = 1;
    x*=5;
    return x;
}
int main() {
    int i;
    for (i=0;i<3;i++) {
        printf("%4d",fac1());
    }
    printf("\n");
    for (i=0;i<3;i++) {
        printf("%4d",fac2());
    }

}
