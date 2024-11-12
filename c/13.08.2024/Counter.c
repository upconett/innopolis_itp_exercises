#include <stdio.h>

// Dumb Way

// int main() {
//     int arr[7];
//     int cs[7];
//     for (int i = 0; i < 7; i++) {
//         scanf("%d", &arr[i]);
//     }
//     for (int i = 0; i < 7; i++) {
//         for (int j = 0; j < 7; j++) {
//             if (arr[i] == arr[j]) cs[i]++;
//         }
//         printf("%d ", cs[i]);
//     }
//     printf("\n");
//     return 0;
// }


// Less Dumb Way

int main() {
    int arr[7], cs[7];
    for (int i = 0; i < 7; i++)
    {
        scanf("%d", &arr[i]); cs[i] = 1;
        for (int j = 0; j < i; j++) {
            if (arr[i] == arr[j]) {cs[i]++; cs[j]++;}
        }
    }
    for (int i = 0; i < 7; i++) printf("%d ", cs[i]);
    printf("\n");
}