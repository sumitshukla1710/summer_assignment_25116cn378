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
    int count=0;
    for(int i=0;i<n;i++){
        if(arr[i]==0){
            count++;
        }
    }
    int k=n-1-count;
    for(int i=0;i<n;i++){
        if(arr[i]==0){
            continue;
        }
        else{
            printf("%d ",arr[i]);
        }
    }
    for(int i=k+1;i<n;i++){
        printf("%d ",0);
    }
   
    
    return 0;
}
