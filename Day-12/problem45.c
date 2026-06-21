#include <stdio.h>
int reverse(int);
int main(){
    int num;
    printf("please enter the number:");
    scanf("%d",&num);
    int result=reverse(num);
    if(num==result){
        printf("%d is palindrome",num);

    }
    else{
        printf("%d is not palindrome",num);
    }
    return 0;
}
int reverse(int num){
    int rev=0;
    int r;
    while(num!=0){
        r=num%10;
        rev=rev*10+r;
        num=num/10;

    }
    return rev;
}