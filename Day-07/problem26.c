#include <stdio.h>
int fib(int);
int main(){
    int n,result;
    printf("enter the no of terms you want:");
    scanf("%d",&n);
    for( int i=0;i<=n-1;i++){
        printf("%d ",fib(i));

    }
    return 0;
}
int fib(int i){
    if(i==0){
        return 0;
    }
    if(i==1)
        return 1;
    return (fib(i-1)+fib(i-2));

}