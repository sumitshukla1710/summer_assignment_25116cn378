#include <stdio.h>
#include <stdbool.h>

bool prime(int);
int main(){
    int num;
    printf("please enter the  number:");
    scanf("%d",&num);
    
    bool result=prime(num);
    if(result){
        printf("%d is prime number",num);
    }
    else{
         printf("%d is not  prime number",num);
    }
    return 0;
}
bool prime(int num){
    int count=0;
    for(int i=1;i<=num;i++){
        if(num%i==0){
            count++;
        }
    }
    if(count==2){
        return true;
    }
    else{
    return false;
    }
}
