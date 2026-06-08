#include <stdio.h>
int main() {
    int n;
    printf("enter the number:");
    scanf("%d",&n);
    int greatest=0;
    
    printf("the factors of %d are: ",n);
    for ( int i=1;i<=n;i++){
       
    
        if(n%i==0){
            printf("%d ",i);
            int count=0;
            for( int j=1;j<=i;j++){
              if(i%j==0){
              
              count++;
                

              }
            }
              if(count==2) {
                   greatest=i;
              }
        }
    }
    
    

    printf("\nthe greatest prime number is  %d ",greatest);
    
   
    return 0;
}
