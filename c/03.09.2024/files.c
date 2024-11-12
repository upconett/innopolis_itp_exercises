#include <stdio.h>

int main() {
    void* f = fopen("result.txt", "w");
    char buffer[1000];
    scanf("%[^\n]", buffer);
    fprintf(f, "%s", buffer);
    return 0;
}