#define _CRT_SECURE_NO_WARNINGS
#include <stdio.h>
#include <stdlib.h>
#include <time.h>

int a,b,c,d;
void init_rng(void) {
    time_t curtime;
        time (&curtime);
    srand((unsigned int) curtime);
}

int gen_rnd_int(void) {
    return (rand())/100000000;
}

void swap(int *a, int *b) {
    int tmp = *a; *a = *b; *b = tmp;
}

void bubble_sort(int *arr, int n) {
    for (int i = 0; i < n; i++)
        for (int j = 1; j < n; j++)
            if (arr[j-1] > arr[j]) swap(&arr[j-1], &arr[j]);
}

int main(void) {
    init_rng();
    a = gen_rnd_int(); b = gen_rnd_int();
    c = gen_rnd_int(); d = gen_rnd_int();
    int arr[4] = {a, b, c, d};
    bubble_sort(arr, 4);
    for (int i = 0; i < 4; i++) printf("%d ", arr[i]);
    printf("\n");
    return 0;
}
