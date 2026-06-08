#include <stdio.h>
int main() {
    int n,r;
    int num_1,num_2;
    int n2;
    
    printf("enter the range for armstrong numbers:\n");
    printf("enter the first number:");
    scanf("%d",&num_1);
    
    printf("enter the last number:");
    scanf("%d",&num_2);
    for ( int i=num_1;i<=num_2;i++) {
        int sum=0;
        n2=i;

    while( n2!=0) {
        r=n2%10;
        sum=sum+r*r*r;
        n2=n2/10;
    }
 
    if(sum==i){
        printf("%d is the  armstrong number.\n",i);
        
       
    }
}
    return 0;

}