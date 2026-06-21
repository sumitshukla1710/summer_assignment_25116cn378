// write program to find maximum frequency element
#include<stdio.h>

int main (){
    int n,d;
    printf("please enter the length of array:");
    scanf("%d",&n);
    int arr[n];
    printf("please enter the elements of array: ");
    for ( int i=0;i<n;i++){
        scanf("%d",&arr[i]);
    }
    int element=arr[0];
    int frequency=1;
    
    for( int i=0;i<n;i++){
        int count=1;
        for(int j=i+1;j<n;j++){
            if(arr[i]==arr[j]){
                count++;
            }
        }
        if(count>frequency){
         element=arr[i];
         frequency=count;
        }
    }
    printf("element: %d \n frequency: %d ",element,frequency);
   
    
    return 0;
}
