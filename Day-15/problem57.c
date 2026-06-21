//reverse of array
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
    int j=n-1;
    for(int i=0;i<n/2;i++){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
        j--;
        
    }
    printf("your reverse of array is: \n");
    for(int i=0;i<n;i++){
        printf("%d ",arr[i]);
    }
    return 0;
}