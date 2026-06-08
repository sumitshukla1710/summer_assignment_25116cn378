#include <stdio.h>
int main() {
    int n,a=0,b=1,c;
    printf("enter the no of terms:");
    scanf("%d",&n);
    if ( n==1){
        printf(" the nth fibonacci term is %d:",a);
    }
    else if ( n==2){
        printf("the nth fibonacci term is %d:",b);
    }
    
    else {
    for( int i=1;i<=n-2;i++){
        c=a+b;
        a=b;
        b=c;
    }
    printf("the nth fibonacci term is :%d",c);
}
    return 0;
}