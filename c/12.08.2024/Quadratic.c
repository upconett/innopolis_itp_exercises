#include <math.h>
#include <stdio.h>

int main() {
    double D, x1, x2;
    double a, b, c;
    scanf("%lf %lf %lf", &a, &b, &c);

    D = (pow(b, 2)) - (4 * a * c);
    if (D < 0) {
        printf("There is no solutions\n");
    }
    else if (D == 0) {
        x1 = (-b + sqrt(D))/(2 * a);
        printf("One Solution: %lf\n", x1);
    }
    else {
        x1 = (-b + sqrt(D))/(2 * a);
        x2 = (-b - sqrt(D))/(2 * a);
        printf("Two Solutions: %lf, %lf\n", x1, x2);
    }

    return 0;
}