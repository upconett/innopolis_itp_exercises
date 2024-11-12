#include <stdio.h>

int digit_count(int number) {
    if (number < 10) return 1;
    return 1 + digit_count(number / 10);
}

int main() {
    int res;
    int num;
    printf("Enter the number: ");
    scanf("%d", &num);
    res = digit_count(num);
    printf("Digits: %d\n", res);
    return 0;
}