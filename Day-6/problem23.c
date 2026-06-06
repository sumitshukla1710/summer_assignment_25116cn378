//count of set bits in a number
#include <stdio.h>
#include <math.h>
int main() {
    int n,r,n3,temp;
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
    int count=0;
    while( result!=0){
        temp=result%10;
        if(temp==1){
            count++;
        }
        result=result/10;
    }
    printf("\nthe count of set bits of %d is %d:",n3,count);
    

    return 0;
}