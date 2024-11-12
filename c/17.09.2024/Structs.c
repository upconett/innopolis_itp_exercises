#include <stdio.h>


struct exam_day {
    int day;
    int year;
    char month[7];
};

struct student {
    char name[30];
    char surname[30];
    int group_number;
    struct exam_day exam_day;
};

int main() {
    struct student you;
    struct exam_day day;

    printf("Enter your name: ");
    scanf("%s", you.name);
    printf("Enter your surname: ");
    scanf("%s", you.surname);
    printf("Enter your group number: ");
    scanf("%d", &you.group_number);

    printf("\nGood\nNow enter the exam day: ");
    scanf("%d", &day.day);
    printf("Now enter the exam year: ");
    scanf("%d", &day.year);
    printf("Now enter the exam month (as a word): ");
    scanf("%s", day.month);

    you.exam_day = day;

    printf("\n\nNow you're:\n\t");
    printf(
        "%s %s from the group: %d\n", 
        you.name, you.surname, you.group_number
    );
    printf(
        "Your exam is on:\n\t %dth of %s %d\n\n",
        you.exam_day.day, you.exam_day.month, you.exam_day.year
    );

    return 0;
}