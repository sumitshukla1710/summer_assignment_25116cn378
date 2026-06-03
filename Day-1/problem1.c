#include <stdio.h>
int main() {
    int n;
    printf("enter the number upto sum of n natural numbers: ");
    scanf("%d", &n);
    int sum = 0;
    for (int i = 1; i <= n; i++) {
        sum += i;
    }
    printf("the sum of first %d natural numbers is: %d\n", n,sum);
    
        return 0;
    }