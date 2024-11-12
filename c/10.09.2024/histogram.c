#include <stdio.h>


int main() {
    char* str; scanf("%[^\n]", str);
    printf("%s", str);
    printf("\n");

    // for (int i = 0; i < 26; i++) chars[i] = 0;

    // int len = 0; int i = 0;
    // while (str[i]) { len++; i++; }

    // printf("%c", 'a'+1);

    // for (int i = 0; i < len;  i++) {
    //     chars['a'-str[i]]++;
    // }

    // for (int i = 0; i < len; i++) {
    //     printf("%c %d", str[i], chars['a'-str[i]]);
    // }

    return 0;
}