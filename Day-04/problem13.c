#include <stdio.h>
int main() {
    int n,a=0,b=1,c;
    printf("enter the no of terms:");
    scanf("%d",&n);
    if ( n>=1){
        printf("%d ",a);
    }
    if( n>=2)
    {
        printf("%d ",b);
    }
    for( int i=1;i<=n-2;i++){
        c=a+b;
        printf("%d ",c);
        a=b;
        b=c;
    }
    return 0;
}