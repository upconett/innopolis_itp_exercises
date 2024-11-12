#include <stdio.h>


void input(int *a, int *b){
	scanf("%d %d", a, b);
}

int summ(int a, int b) {return a + b;}
int diff(int a, int b) {return a - b;}
int mult(int a, int b) {return a * b;}
float divi(int a, int b){
	return (float)a / (float)b;
}


int main() {
	int a, b;
	input(&a, &b);

	printf("%d + %d = %d\n", a, b, summ(a,b));
	printf("%d - %d = %d\n", a, b, diff(a,b));
	printf("%d * %d = %d\n", a, b, mult(a,b));
	printf("%d / %d = %f\n", a, b, divi(a,b));

	return 0;
}
