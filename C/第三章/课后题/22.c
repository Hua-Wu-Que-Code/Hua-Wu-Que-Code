//
// Created by 花无缺 on 2023/8/12.
//
#include <stdio.h>
#include <math.h>

void main()
{	int m1,m2,m5,c=0;
    for(m1=0;m1<=100;m1++)
        for(m2=0;m2<=50;m2++)
            for(m5=0;m5<=20;m5++)
                if(m1+2*m2+5*m5==100)
                    c++;
    printf("%d\n",c);
}
