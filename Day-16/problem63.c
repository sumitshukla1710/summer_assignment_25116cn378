// write program to find pair with given sum
#include <stdio.h>
int main(){
    int n,target;
    printf("please enter the length of the array: ");
    scanf("%d",&n);
    int arr[n];
    printf("please enter the elemnts of the array:");
    for(int i=0;i<n;i++){
        scanf("%d",&arr[i]);
    }
    printf("please enter target sum: ");
    scanf("%d",&target);
    int found=0;
    for( int i=0;i<n;i++){
        
        for(int j=i+1;j<n;j++){
        if(arr[i]+arr[j]==target){
            printf("pair found: %d and %d\n",arr[i],arr[j]);
            found=1;
        }
        }
    }
    if(found==0){
        printf("no pair found");
    }

    return 0;
}