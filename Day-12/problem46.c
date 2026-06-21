#include <stdio.h>
#include<math.h>
int armstrong(int);
int main(){
    int num;
    printf("please enter the number:");
    scanf("%d",&num);
    int result=armstrong(num);
    if(num==result){
        printf("%d is armstrong number",num);

    }
    else{
        printf("%d is not armstrong",num);
    }
    return 0;
}
int armstrong(int num){
    int count=0;
    int num2=num;
    while(num!=0){
        count++;
        num=num/10;
    }
    int sum=0,r;
    while(num2!=0){
        r=num2%10;
        sum=sum+pow(r,count);
        num2=num2/10;

    }
    return sum;

}
    