#include <stdio.h>
int main() {
    int n,sum=0,r;
    
    printf("enter the numbetr:");
    scanf("%d",&n);
    int n2=n;
    while( n!=0) {
        r=n%10;
        sum=sum+r*r*r;
        n=n/10;
    }
    if(sum==n2){
        printf("%d is armstrong number.",n2);
    }
    else{
        printf("%d is not armstrong number.",n2);
    }
    return 0;

}