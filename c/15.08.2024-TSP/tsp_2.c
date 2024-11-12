
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


int shortest_path_length(int distances[5][5], int optPath[6]) {
    int curOptPathLength = INT_MAX;
    int city0 = 0;
    for (int city1 = 1; city1 < 5; city1++) {
        for (int city2 = 1; city2 < 5; city2++) {
            for (int city3 = 1; city3 < 5; city3++){
                for (int city4 = 1; city4 < 5; city4++){
                    if (
                        city1 != city2 && 
                        city1 != city3 && 
                        city1 != city4 && 
                        city2 != city3 &&
                        city2 != city4 &&
                        city3 != city4
                    ) {
                        int pathLength = distances[city0][city1] +
                                        distances[city1][city2] +
                                        distances[city2][city3] +
                                        distances[city3][city4] +
                                        distances[city4][city0];
                        if (pathLength < curOptPathLength) {
                            curOptPathLength = pathLength;
                            optPath[0] = city0;
                            optPath[1] = city1;
                            optPath[2] = city2;
                            optPath[3] = city3;
                            optPath[4] = city4;
                            optPath[5] = city0;
                        }
                    }
                }
            }
        }
    }
    return curOptPathLength;
}


int main() {
    int arr[5][5], opt_path[6];
    printf("Input distances between 5 cities\n");
    for (int i = 0; i < 5; i++) {
        for (int j = i+1; j < 5; j++) {
            printf("Between cities %d and %d?\n", i, j);
            scanf("%d", &arr[i][j]);
            arr[j][i] = arr[i][j];
        }
    }
    int result = shortest_path_length(arr, opt_path);
    printf("Result: %d\n", result);
    printf("Optimal Path: 0 > %d > %d > %d > %d > 0\n", 
        opt_path[1], opt_path[2], opt_path[3], opt_path[4]);
    return 0;
}
