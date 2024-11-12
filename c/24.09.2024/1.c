// day 5 bits 32-1 = 31 days max
// month 4 bits 16-4 = 12 months max
// year 11 bits 2048 years

#include <stdio.h>

struct birthdate {
    unsigned short day : 5;
    unsigned short month : 4;
    unsigned short year : 7;
};


int main() {

    struct birthdate bd =
        { .day = 31, .month = 12, .year = 2006 - 1900 };
    printf("struct size: %lu\n\n", sizeof(bd));
    printf("day: %d\nmonth: %d\nyear: %d\n", bd.day, bd.month, 1900+bd.year);

    return 0;
}