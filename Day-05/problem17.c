#include <stdio.h>
int main() {
    int n,n2;
    printf("enter the number:");
    scanf("%d",&n);
    n2=n;
    int sum=0;
    if(n<=1){
        printf("%d is not perfect number",n2);
    }
    else {
    for( int i=1;i<n;i++){
        if(n%i==0){
            sum=sum+i;

        }
       
    }
     if(sum==n2){
            printf("%d is perfect number",n2);
        }
        else{
            printf("%d is not perfect number",n2);
        }
    }
    return 0;

}