#include <stdio.h>
int main() {
    int n, result;
    
    printf("enter the number for table:");
scanf("%d",&n);
for( int i=1; i<=10;i++)
{
    result= n*i;
    printf("%d*%d=%d\n",n,i,result);
}
return 0;
}
