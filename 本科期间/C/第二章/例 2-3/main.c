//
// Created by 花无缺 on 2023/7/31.
//

#include <stdio.h>
int max(int a,int b) {
    return a > b ? a:b;
}
void main() {
    int a,b,c;
    scanf("%d%d",&a,&b);
    c = max(a,b);
    printf("%d\n",c);

    float d;
    d = .6;
    printf("%f",d);

}