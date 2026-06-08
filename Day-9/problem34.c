#include <stdio.h>
int main(){
    int n;
    printf("enter the number of raws:");
    scanf("%d",&n);
    for(int i=1;i<=n;i++){
        int a=1;
        for(int j=1;j<=n-i+1;j++){
            printf("%d",a);
            a++;

        }
        printf("\n");
    }
    return 0;
}