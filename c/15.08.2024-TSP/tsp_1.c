#include <stdio.h>
#include <time.h>
#include <limits.h>

// Assumptions:
// - Any tow cities are directly connected
// - Ant city except A is visited once


int get_distances(int** arr, int x, int y) {
    for (int i = 0; i < y; i++) {
        for (int j = 0; j < x; j++) {
            printf("Between cities %d and %d?\n", i, j);
            scanf("%d", &*&arr[i][j]);
        }
    }
}


int shortest_path_length(int distances[4][4], int optPath[5]) {
    int curOptPathLength = INT_MAX;
    int city0 = 0;
    for (int city1 = 1; city1 < 4; city1++) {
        for (int city2 = 1; city2 < 4; city2++) {
            for (int city3 = 1; city3 < 4; city3++){
                if (
                    city1 != city2 && 
                    city1 != city3 && 
                    city2 != city3
                ) {
                    int pathLength = distances[city0][city1] +
                                     distances[city1][city2] +
                                     distances[city2][city3] +
                                     distances[city3][city0];
                    if (pathLength < curOptPathLength) {
                        curOptPathLength = pathLength;
                        optPath[0] = city0;
                        optPath[1] = city1;
                        optPath[2] = city2;
                        optPath[3] = city3;
                        optPath[4] = city0;
                    }
                }
            }
        }
    }
    return curOptPathLength;
}


int main() {
    int arr[4][4], opt_path[5];
    printf("Input distances between 4 cities\n");
    for (int i = 0; i < 4; i++) {
        for (int j = i+1; j < 4; j++) {
            printf("Between cities %d and %d?\n", i, j);
            scanf("%d", &arr[i][j]);
            arr[j][i] = arr[i][j];
        }
    }
    int result = shortest_path_length(arr, opt_path);
    printf("Result: %d\n", result);
    printf("Optimal Path: 0 > %d > %d > %d > 0\n", 
        opt_path[1], opt_path[2], opt_path[3]);
    return 0;
}
