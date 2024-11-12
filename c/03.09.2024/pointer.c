#include <stdio.h>

int* p;

void f() {
    int local;
    p = &local;
}

void main() {
    f();
    *p = 777;
    printf("%d", *p);
}