#include <stdio.h>


int fact(int a) {
    int result = 1;
    for (int i = 1; i <= a; i++) {
        result = result * i;
    }
    return result;
}


int is_strong(int a) {
    int sum = 0;
    int init = a;
    while (a) {
        sum += fact(a % 10);        
        a /= 10;
    }
    if (sum == init) return 1;
    return 0;
}


int main() {
    int from, to;
    scanf("%d %d", &from, &to);
    
    for (int i = from; i < to; i++) {
        if (is_strong(i))
            printf("%d, ", i);
    }
    printf("\n");
    
    return 0;
}