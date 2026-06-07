#include <stdio.h>
int sod(int);

int main() {
    int n,result;
    printf("enter the number:");
    scanf("%d",&n);
    result=sod(n);
    printf("the sum of digit is %d",result);

    return 0;
}
int sod(int n){
    if(n==0){
        return 0;

    }
    else{
        return (n%10+sod(n/10));
    }
}