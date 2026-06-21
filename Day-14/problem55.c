#include<stdio.h>
#include<limits.h>
int main(){
    int n;
    printf("please enter the length of array:");
    scanf("%d",&n);
    int arr[n];
    printf("please enter the elements of array:");
    for ( int i=0;i<n;i++){
        scanf("%d",&arr[i]); 
    }
   int secondmax=INT_MIN;
   int max=arr[0];
    
    for(int i=0;i<n;i++){
        if(arr[i]>max){
            max=arr[i];
        }
     
    }
    for(int i=0;i<n;i++){
        if(arr[i]>secondmax && arr[i]<max){
            secondmax=arr[i];
        }
    }if(secondmax==INT_MIN){
        printf("no second largest element exists:");
    }
    else{
    printf("the second maximum number of array is %d",secondmax);
    }
return 0;
}