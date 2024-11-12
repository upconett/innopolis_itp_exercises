#include <stdio.h>

int main() {
    char strBuff[10];
    int blen;
    
    scanf("%10[^\n]", strBuff);
    blen = sizeof(strBuff) / sizeof(char);
    printf("%s %d\n", strBuff, blen);

    for (int i = 0; i < 10; i++) {
        printf("%c ", strBuff[i]);
    }

    return 0;
}