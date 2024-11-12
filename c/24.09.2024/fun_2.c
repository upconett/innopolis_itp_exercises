#include <stdio.h>

union packet {
    unsigned header;
    struct {
        unsigned version : 4;
        unsigned IHL : 4;
        unsigned DSCP : 6;
        unsigned ECN : 2;
        unsigned total_len : 16;
    } decode;
};

int main() {
    union packet request = {
        .header = 123
    };
    printf("Version: %d\n", request.decode.version);
    printf("IHL: %d\n", request.decode.IHL);
    printf("DSCP: %d\n", request.decode.DSCP);
    printf("ECN: %d\n", request.decode.ECN);
    printf("Total Lenght: %d\n", request.decode.total_len);
    return 0;
}
