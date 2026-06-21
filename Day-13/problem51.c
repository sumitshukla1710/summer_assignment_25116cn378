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
    int max=arr[0];
    int min=arr[0];
    
    for(int i=0;i<n;i++){
        if(max<arr[i]){
            max=arr[i];
        }
        if(min>arr[i]){
            min=arr[i];
        }
       
     
    }
    printf("the max of array is %d and minimum of array is %d",max,min);
return 0;
}