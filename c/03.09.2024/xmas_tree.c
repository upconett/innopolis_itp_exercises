#include <stdio.h>
#include <stdlib.h>

int main() {
    int size;
    printf("Enter size of a tree: ");
    scanf("%d", &size);
    size++;
    for (int i = 0; i < size; i++) {
        for (int j = 0; j < size-i; j++) printf(" ");
        for (int j = 0; j < i; j++) printf("*");
        for (int j = 0; j < i-1; j++) printf("*");
        printf("\n");
    }
    int thick = size/4;
    for (int i = 0; i < size/4; i++) {
        
        for (int j = 0; j < size-thick; j++) printf(" ");
        for (int j = 0; j < thick; j++) printf("*");
        for (int j = 0; j < thick-1; j++) printf("*");
        printf("\n");
    }

    return 0;
}