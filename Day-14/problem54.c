#include<stdio.h>
int main(){
    int n,target;
    printf("please enter the length of array:");
    scanf("%d",&n);
    int arr[n];
    printf("please enter the elements of array:");
    for ( int i=0;i<n;i++){
        scanf("%d",&arr[i]);
    }
    int count=0;
    printf("please enter the element for frequency check: ");
    scanf("%d",&target);
    
    for(int i=0;i<n;i++){
        if(arr[i]==target){
            count++;
        }
       
    }
    printf("your element comes %d times in array",count);
  return 0;
}