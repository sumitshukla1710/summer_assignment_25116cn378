#include <stdio.h>
#include<math.h>
int perfect(int);
int main(){
    int num;
    printf("please enter the number:");
    scanf("%d",&num);
    int result=perfect(num);
    if(num==result){
        printf("%d is perfect number number",num);

    }
    else{
        printf("%d is not perfect number",num);
    }
    return 0;
}
int perfect(int num){
    int sum=0;
    int r;
    for( int i=1;i<num;i++){
    if(num%i==0){
        sum=sum+i;
    }
    }
    return sum;

}
    