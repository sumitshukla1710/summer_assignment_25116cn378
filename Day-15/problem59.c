//right rotation
#include<stdio.h>
void reverse(int[],int,int);
int main (){
    int n,d;
    printf("please enter the length of array:");
    scanf("%d",&n);
    int arr[n];
    printf("please enter the elements of array: ");
    for ( int i=0;i<n;i++){
        scanf("%d",&arr[i]);
    }
    printf("please inter the number of rotation: ");
    scanf("%d",&d);
    d=d%n;
    ;
    reverse(arr,n-d,n-1);
    reverse(arr,0,n-d-1);
    reverse(arr,0,n-1);
printf("after rotation %d times array is:",d);
for(int i=0;i<n;i++){
    printf("%d ",arr[i]);
}
        
    
    return 0;
}
void reverse(int arr[],int i,int j){
    
    while(i<j){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
        j--;
        i++;
    }

}