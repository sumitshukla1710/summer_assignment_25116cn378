#include<stdio.h>
#include<stdbool.h>
int main(){
    int n,target;
    printf("please enter the length of array:");
    scanf("%d",&n);
    int arr[n];
    printf("please enter the elements of array:");
    for ( int i=0;i<n;i++){
        scanf("%d",&arr[i]);
    }
    printf("please enter the elment you want to search: ");
    scanf("%d",&target);
    bool flag=false;
    int row=-1;
    for(int i=0;i<n;i++){
       if(arr[i]==target){
        flag=true;
        row=i;
        break;
       }
     
    }
    if(flag){
        printf("%d is present in this array and at postion %d ",target,row+1);
    }
    else{
        printf("%d is not present in this array",target);
    }
return 0;
}