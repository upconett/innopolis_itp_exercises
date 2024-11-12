#include <stdio.h>

int sum_itr(int arr[5]);
int sum_rec_nt(int arr[5]);

int main() {
    int myArr[5];
    for (int i = 0; i < 5; i++) {
        scanf("%d", &myArr[i]);
    }

    int sumnt = sum_rec_nt(myArr);
    int sumit = sum_itr(myArr);

    printf("%d %d\n", sumnt, sumit);

    
    return 0;
}

int sum_itr(int arr[5]) {
    int sum = 0;
    for (int i = 0; i < 5; i++) sum += arr[i];
    return sum;
}

int sum_rec_nt(int arr[5]) {
    static int i = 4;
    if (i == 0) {
        return arr[i];
    }
    i--;
    return arr[i] + sum_rec_nt(arr);
}