#include <stdio.h>
#include <stdlib.h>

// void swap_fov(int* arr, int j) {
//     int temp = *arr[j];
//     *arr[j] = *arr[j-1];
//     *arr[j-1] = temp;
// }

// void bubble_sort(int* arr) {
//     int length = sizeof(*arr) / sizeof(int)
//     for (int i = 0; i < length-1; i++) {
//         for (int j = i+1; j < length; j++) {
//             if (*arr[j-1] > *arr[j])
//                 swap_fov(arr, j);
//             else
//                 continue;
//         }
//     }
// }

void print_arr(int* arr) {
    int length = sizeof(arr) / sizeof(int);
    for (int i = 0; i < length; i++) {
        printf("%i ", arr[i]);
    }
    printf("\n");
}

void fill_arr(int* arr) {
    int d = 0;
    int length = sizeof(arr) / sizeof(int);
    for (int i = 0; i < length; i++) {
        scanf("%d", &d);
        arr[i] = d;
    }
}

int main() {
    int* arr = (int*)malloc(sizeof(int)*10);
    fill_arr(arr);
    print_arr(arr);
    return 0;
}