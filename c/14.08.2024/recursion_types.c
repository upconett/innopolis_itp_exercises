#include <stdio.h>
#include <time.h>

int get_sum_nt(int arr[], int k) {
    if (k == -1) return 0;
    else return arr[k] + get_sum_nt(arr, k - 1);
}

int get_sum_t(int arr[], int k, int s) {
    if (k == -1) return s;
    return get_sum_t(arr, k-1, s+arr[k]);
}


int main() {
    int myArr[256];
    for (int i = 0; i < 256; i++) {
        scanf("%d", &myArr[i]);
    }

    clock_t start = clock();

    int sum = get_sum_t(myArr, 255, 0);
    printf("%d\n", sum);

    clock_t end = clock() - start;

    double timeTaken = ((double)end) / CLOCKS_PER_SEC;
    printf("Time taken %f sec\n", timeTaken);

    return 0;
}