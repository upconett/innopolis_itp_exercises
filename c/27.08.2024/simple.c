/* Simple hello world */
#include <stdio.h>
#define NAME "GCC\n"

void helper() {printf(NAME);}
char other();
int a;

int main() {
	printf("Hello, World!\n");
	return 0;
}
char other() {
	return '\0';
}
