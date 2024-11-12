#include <stdio.h>

int main() {
    int size = 3;
    int arr[size];
    fill_arr(arr, size);

    for (int i = 0; i < size; i++) {
        printf("%d ", arr[i]);
    }

    return 0;
}

int fill_arr(int *arr, int size) {
    for (int i = 0; i < size; i++) scanf("%d", &arr[i]);
}
