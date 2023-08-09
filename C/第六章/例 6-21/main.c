#include <stdio.h>
#include <math.h>

float f1(float x) {
    return x*x+x*4+2;
}
float f2(float x) {
    return 5* sin(x);
}
float f3(float x) {
    return 10*x+1;
}
float getMin(float (*p)(float),float p1,float p2) {
    float f,t,fMin,fSteep = 0.01;
    fMin = (*p)(p1);
    for (f = p1; f < p2; f+=fSteep) {
        t = (*p)(f);
        if (t<fMin) fMin = t;
    }
    return fMin;
}
int main() {
    printf("%f", getMin(f2,1,3));
}
