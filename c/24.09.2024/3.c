#include <stdio.h>
#include <stdlib.h>

enum weekdays {
    Monday,
    Tuesday,
    Wednesday,
    Thursday,
    Friday,
    Saturday,
    Sunday
};


int main() {
    int num;
    printf("Enter weekday number: ");
    scanf("%d", &num);
    enum weekdays wd = num-1;
    char* output = (char*) malloc(10);
    switch (wd) {
        case Monday: output = "Monday"; break;
        case Tuesday: output = "Tuesday"; break;
        case Wednesday: output = "Wednesday"; break;
        case Thursday: output = "Thursday"; break;
        case Friday: output = "Friday"; break;
        case Saturday: output = "Saturday"; break;
        case Sunday: output = "Sunday"; break;
        default: output = "your mum's ass size";
    }
    printf("It is %s, ain't it?\n", output);
    return 0;
}
