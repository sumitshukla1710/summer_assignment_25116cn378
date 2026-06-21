#include<stdio.h>
int main(){
    int n;
    printf("please enter the length of array:");
    scanf("%d",&n);
    int arr[n];
    printf("please enter the elements of array:");
    for ( int i=0;i<n;i++){
        scanf("%d",&arr[i]);
    }
    printf("your array is:");
    for(int i=0;i<n;i++){
     printf("%d ",arr[i]);
    }
return 0;
}