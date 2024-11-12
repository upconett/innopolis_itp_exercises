#include <stdio.h>


int factorial (int n) {
    if (n == 0 || n == 1) {
        return 1;
    }
    printf("%d\n", n);
    return factorial(n - 1) * n;
}


int main() {
    printf("%d", factorial(5));
}
