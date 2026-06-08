#include <stdio.h>
int main(){
    int n;
    printf("enter the number of raws:");
    scanf("%d",&n);

    
    
    for(int i=1;i<=n;i++){
        for ( int k=1;k<=i;k++){

        printf(" ");
    }
        
        for(int j=1;j<=(11-(2*i));j++){
            printf("*");
            
        }
        printf("\n");
        

    }
    return 0;
}       