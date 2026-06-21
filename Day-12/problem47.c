#include <stdio.h>
void fibnoacci(int);

int main(){
    int num;
    printf("please enter the numebr of terms you want in fibnoacci:");
    scanf("%d",&num);
    fibnoacci(num);
    return 0;

}
void fibnoacci(int num){
    int a=0,b=1;
    if(num>=1){
        printf("%d",a );
        printf(" ");
    }
    if(num>=2){
        printf("%d",b );
        printf(" ");
    }
    for(int i=1;i<=num-2;i++){
       int c=a+b;
       printf("%d",c );
       printf(" ");
       a=b;
       b=c;
    }
}