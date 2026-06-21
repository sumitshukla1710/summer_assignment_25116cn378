#include <stdio.h>
int main() {
    int n,r;
    int rev=0;
    printf("Enter a number: ");
    scanf("%d",&n);
    int n2=n;
    while(n>0){
        r=n%10;
        rev=rev*10+r;
        n=n/10;
    }
    if (rev==n2) {
        printf("The number is a palindrome.");
    }
    else {
        printf("The number is not a palindrome.");
    }
    return 0;
}