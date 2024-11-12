#include "ParseToArr.c"

int main() {
    int inp[3];
    int n = sizeof(inp) / sizeof(int);
    for (int i = 0; i < n; i++) {
        scanf("%d", &inp[i]);
    }
    int sum = 0;
    for (int i = 0; i < n; i++) {
        printf("%d ", inp[i]);
        sum += inp[i];
    }
    printf("\nSUM: %d\n", sum);
    return 0;
}