#include <stdio.h>
int main() {
    int n,r;
    printf("enter the number:");
    scanf("%d",&n);
    int n2=n;
    int product=1;
    while(n>0){
        r=n%10;
        product=product* r;
        n=n/10;
    }

    printf(" the product of the digits of %d is :%d", n2 ,product);
     return 0;

    
}