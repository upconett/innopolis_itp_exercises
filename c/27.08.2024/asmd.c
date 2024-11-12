#include <stdio.h>


void input(int *a, int *b){
	scanf("%d %d", a, b);
}


int main() {
	int a, b;
	input(&a, &b);

	int s = a + b;
	int d = a - b;
	int m = a * b;
	float q = (float)a / (float)b;

	printf("%d + %d = %d\n", a, b, s);
	printf("%d - %d = %d\n", a, b, d);
	printf("%d * %d = %d\n", a, b, m);
	printf("%d / %d = %f\n", a, b, q);

	return 0;
}
