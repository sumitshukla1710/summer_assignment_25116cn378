#include <stdio.h>
int factorial(int);
int main(){
    int num;
    printf("please enter the  number:");
    scanf("%d",&num);
   
    int result=factorial(num);
    printf("the factorial of %d  is %d",num,result);
    return 0;
}
int factorial(int num){
    int fact=1;
    for(int i=1;i<=num;i++){
        fact=fact*i;
    }
    return fact;
}