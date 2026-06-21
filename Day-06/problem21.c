//decimal to binary
#include <stdio.h>
#include <math.h>
int main() {
    int n,r,n3;
    int n1=0;
    int result=0;
    
    
    
    printf("enter the decimal number: ");
    scanf("%d",&n);
    n3=n;
    while (n!=0){
        r=n%2;
        result=result+(r*pow(10,n1));
        n1++;
        n=n/2;
        
    }
    printf("the binary number of decimal %d is %d",n3,result);
    

    return 0;
}