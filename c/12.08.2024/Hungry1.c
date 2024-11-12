#include <stdio.h>
#include <stdbool.h>

int main() {
    char *color;
    int x, y;
    scanf("%d %d", &x, &y);

    bool xeven = (x % 2 == 0);
    bool yeven = {y % 2 == 0};

    if (xeven && yeven) color = "black";
    else if (xeven && !yeven) color = "white";
    else if (!xeven && yeven) color = "white";
    else color = "black";

    printf("The color is %s\n", color);
    return 0;
}
