#include <stdio.h>

union StoredMessage {
    long long int number;
    unsigned char segments[sizeof(long long int)];
};

void encrypt(union StoredMessage msg) {
    char temp;
    for (int k = 0; k < 2; k++) {
        for (int i = 0; i < sizeof(msg.number); i += 2) {
            temp = msg.segments[i];
            msg.segments[i] = msg.segments[i+1];
            msg.segments[i+1] = temp;
        }
        if (k==0) {prinf}
    }

    printf("encrypted : %lld\n", msg.number);
}

int main() {
    union StoredMessage sm;
    printf("Enter the message: ");
    scanf("%lld", &sm.number);
    encrypt(sm);
    
    return 0;
}
