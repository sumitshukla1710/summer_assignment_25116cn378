// write program to remove duplicate from the array
#include<stdio.h>
int main (){
    int n;
    printf("please enter the length of array:");
    scanf("%d",&n);
    int arr[n];
    printf("please enter the elements of array: ");
    for ( int i=0;i<n;i++){
        scanf("%d",&arr[i]);
    }
    
    for(int i=0;i<n;i++){
        int duplicate=0;
        for(int j=0;j<i;j++){
            if(arr[i]==arr[j]){
                duplicate=1;
                break;
            }
        }
        if(duplicate==0){
            printf("%d ",arr[i]);
        }
    }
    
    
    return 0;
}

