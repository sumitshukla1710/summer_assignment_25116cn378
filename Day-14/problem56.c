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
    printf("the duplictes in array are:\n");
    int found=0;
    for(int i=0;i<n;i++){
        for( int j=i+1;j<n;j++){
           if(arr[i]==arr[j]){
            printf("%d ",arr[i]);
            found=1;
           }
           
           
        }
    
    }
    if(found==0){
        printf("there is not any duplicate in array");
    }
    
  return 0;
}