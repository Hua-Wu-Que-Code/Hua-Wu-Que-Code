//
// Created by 花无缺 on 2023/8/12.
//
#include <stdio.h>
#include <math.h>

/*void main() {
    int i =10006,s=0;
    for (;i<99999;i+=10) {
        if(i%3==0) {
            printf("%d是的\n",i);
            s++;
        } else printf("%d不是的\n",i);
    }
    printf("%d\n",s);
}*/
void main()
{	int x,y,c=0;
    for(x=1000;x<10000;x++)
    {	y=x*10+6;
        if(y%3==0) c++;
    }
    printf("%d\n",c);
}