#include <stdio.h>

int main() {
    char name[100];
    int age;

    printf("Enter name and age: ");
    scanf("%s %d", &name, &age);

    if (age < 0 || age > 100) {
        printf("FuckOf");
    }
}