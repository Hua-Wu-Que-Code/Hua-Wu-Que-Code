#include <stdio.h>
#include <math.h>

double f(double x) {
    return x*x*x - 2*x*x - 4*x - 7;
}

double df(double x) {
    return 3*x*x - 4*x - 4;
}

double newton_raphson(double x0, double epsilon) {
    double x = x0,fx,dfx;
    do {
        fx = f(x);
        dfx = df(x);
        x = x - fx / dfx;
    } while (fabs(fx) < epsilon);

    return x;
}

int main() {
    double x0 = 4.0;
    double epsilon = 1e-5;


    double approx_solution = newton_raphson(x0, epsilon);

    printf("Approximate solution: %lf\n", approx_solution);

    return 0;
}
