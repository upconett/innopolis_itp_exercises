#include <stdio.h>
#include <time.h>

unsigned long fib_nt(unsigned n) {
    if (n <= 1) return n;
    return fib_nt(n - 1) + fib_nt(n - 2);
}

unsigned long fib_tr(
    unsigned prev, unsigned cur, unsigned n
) {
    if (n == 0) return cur;
    return fib_tr(cur, prev+cur, n-1);
}

unsigned long fib_tailrec(unsigned n) {
    if (n==0) return 0;
    return fib_tr(0, 1, n-1);
}

unsigned long fib_itr(unsigned n) {
    unsigned long a = 1, b = 1;
    if (n < 2) return n;
    for (unsigned i = 1; i < n; ++i) {
        b += a;
        a = b - a;
    }
    return a;
}


int main() {

    clock_t start = clock();
    unsigned long res = fib_nt(40);
    clock_t end = clock() - start;
    double timeTaken = ((double)end) / CLOCKS_PER_SEC;
    printf("NonTailed Rec (%lu): %lf sec\n", res, timeTaken);

    start = clock();
    res = fib_tailrec(40);
    end = clock() - start;
    timeTaken = ((double)end) / CLOCKS_PER_SEC;
    printf("Tailed Rec (%lu): %lf sec\n", res, timeTaken);

    start = clock();
    res = fib_itr(40);
    end = clock() - start;
    timeTaken = ((double)end) / CLOCKS_PER_SEC;
    printf("Iterative (%lu): %lf sec\n", res, timeTaken);

    return 0;
}