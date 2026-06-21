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
    int odd=0;
    int even=0;
    for(int i=0;i<n;i++){
       if(arr[i]%2==0){
        even++;
       }
       else{
        odd++;
       }
     
    }
    printf("the number of even elemnets in array is %d and odd elements is %d",even,odd);
return 0;
}