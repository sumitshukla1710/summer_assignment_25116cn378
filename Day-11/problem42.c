#include <stdio.h>
int max(int,int);
int main(){
    int num1,num2;
    printf("please enter the first number:");
    scanf("%d",&num1);
    printf("please enter the second number:");
    scanf("%d",&num2);
    int result=max(num1,num2);
    printf("the maximum of %d and %d is %d",num1,num2,result);
    return 0;
}
int max(int num1,int num2){
    if(num1>num2){
        return num1;
    }
    else{
        return num2;
    }
}
