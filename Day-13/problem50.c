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
    int sum=0;
    float average;
    for(int i=0;i<n;i++){
        sum=sum+arr[i];
     
    }printf("the sum of all elemnts of array is: %d\n",sum);
    average=((float)sum/n);
    
    printf("the average of all elments of array is:%f",average);
return 0;
}