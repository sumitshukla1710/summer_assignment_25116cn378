#include <stdio.h>
int sum(int,int);
int main(){
    int num1,num2;
    printf("please enter the first number:");
    scanf("%d",&num1);
    printf("please enter the second number:");
    scanf("%d",&num2);
    int result=sum(num1,num2);
    printf("the sum of %d and %d is %d",num1,num2,result);
    return 0;
}
int sum(int num1,int num2){
    return (num1+num2);
}
