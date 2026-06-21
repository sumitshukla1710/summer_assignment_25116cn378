// missing element
// the array contains numbers from 1 to n with one missing element
#include<stdio.h>
int main (){
    int n;
    printf("please enter the length of array:");
    scanf("%d",&n);
    int arr[n-1];
    printf("please enter the elements of array: ");
    for ( int i=0;i<n-1;i++){
        scanf("%d",&arr[i]);
    }
    int sum1=(n*(n+1))/2;
    int sum2=0;
    for(int i=0;i<n-1;i++){
        sum2=sum2+arr[i];

    }
    printf("the missing elemnt in the array is: %d",sum1-sum2);
    
    return 0;
}

