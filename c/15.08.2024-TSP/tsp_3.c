#include <stdio.h>
#include <limits.h>


// дереференсинг памяти, через звездочки

int fill_paths(int arr[], int x, int y) {
    for (int i = 0; i < y; i++) {
        for (int j = 0; j < x; j++) {
            scanf("%d", &arr[x*i+j]);
        }
    }
}


int main() {
    int arr[4][4];
    fill_paths(arr, 4, 4);
    for (int i = 0; i < 4; i++) {
        for (int j = 0; j < 4; j++) {
            printf("%d ", arr[i][j]);
        }
        printf("\n");
    }
    return 0;
}