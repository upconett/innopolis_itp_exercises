#include <stdio.h>
#include <stdlib.h>


int main() {
    char line[100];
    scanf("%s", line);

    int i = 0;
    char a = line[i];
    while (a != 0) {
        i++; a = line[i]; }

    char* rev = (char*)malloc(i * sizeof(char));
    for (int j = 0; j<=i; j++){
        printf("%c", line[i-j]); }
    
    printf("%s\n", rev);
    
    return 0;
}