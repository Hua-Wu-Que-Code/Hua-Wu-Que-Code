//
// Created by 花无缺 on 2023/6/24.
//

#include <stdio.h>

int main() {

    float s[10],max,min,sum,score;

    int i;
    for (i = 0;i<10;i++) {
        scanf("%f",&s[i]);
        if (i==0) max = min = sum = s[i];
        max = max > s[i] ? max : s[i];
        min = min < s[i] ? min : s[i];
        sum += s[i];
    }
    score = (sum - max - min) /8;
    printf("最终成绩为:%f",score);
    return 0;
}
