#include <stdio.h> 
int factorial(int r){
    if(r==0){
        return 1;
    }
    else{
        return (r*factorial(r-1));
    }
}
    int main(){
        int n,r,p,n2;
        int sum=0;
            printf("enter the number:");
            scanf("%d",&n);
            n2=n;
            
        while ( n!=0){
            r=n%10;
            p=factorial(r);

            sum=sum+p;

            n=n/10;

        }
        if(n2==sum){
            printf("%d is strong number",n2);
        }
        else{
            printf("%d is not strong number",n2);
        }
    
    return 0;
}