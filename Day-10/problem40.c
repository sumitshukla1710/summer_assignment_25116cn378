#include <stdio.h>
int main(){
    int n;
    printf("enter the number of raws:");
    scanf("%d",&n);

    
    
    for(int i=1;i<=n;i++){
        for ( int k=1;k<=n-i;k++){

        printf(" ");
    }
        int b=65;
        for(int j=1;j<=i;j++){
            printf("%c",b);
            b++;
            
        }
        int a=i-1;
        for( int l=1;l<=i-1;l++){
            char ch= (char)(a+64);
            printf("%c",ch);
            a--;
        }
        printf("\n");
        

    }
    return 0;
}