#include <stdio.h>
int main() {
    int n,r;
    int sum=0;
    printf("Enter a number: ");
    scanf("%d",&n);
    while(n>0){
        r=n%10;
        sum=sum+r;
        n=n/10;
    }
    printf("The sum of the digits is: %d",sum);
    return 0;
}