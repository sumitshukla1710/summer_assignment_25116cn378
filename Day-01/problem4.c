#include <stdio.h>
int main() {
    int n;
    printf("enter the number :");
    scanf("%d", &n);
    int count=0;
    if(n==0){
        count=1;
    }
    else {
    while (n>0) {
        n=n/10;
        count++;
    }
}
    printf("number of digits in the given number is: %d",count);
    return 0;
}