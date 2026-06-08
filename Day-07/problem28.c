#include <stdio.h>
int rev(int);

int main() {
    int n,result;
    printf("enter the number:");
    scanf("%d",&n);
    int n2=n;
    result=rev(n);
    printf("the reverse of %d is %d",n2,result);

    return 0;
}
int r=0;

int rev(int n){
    if(n==0)
    return r;
    r=r*10+n%10;
    return rev(n/10);
    
    
}