// binary to decimal
#include <stdio.h>
#include <math.h>
int main() {
    int n,r,n3;
    int n1=0;
    int result=0;
    
    
    
    printf("enter the binary number: ");
    scanf("%d",&n);
    n3=n;
    while (n!=0){
        r=n%10;
        result=result+(r*pow(2,n1));
        n1++;
        n=n/10;
        
    }
    printf("the decimal number of binary %d is %d",n3,result);

    

    return 0;
}