//COMMON ELEMENTS OF ARRAY
#include<stdio.h>
int main(){
    int n,m;
    printf("please enter the length of the first array;");
    scanf("%d",&n);
    int arr1[n];
    printf("please enter the elements of the first array:");
    for( int i=0;i<n;i++){
        scanf("%d",&arr1[i]);
    }
    printf("please enter the length of the second array;");
    scanf("%d",&m);
    int arr2[m];
    printf("please enter the elements of the second array:");
    for( int i=0;i<m;i++){
        scanf("%d",&arr2[i]);
    }
    int found=0;
    printf("common elements = ");
    for(int i=0;i<n;i++){
        for(int j=0;j<m;j++){
            if(arr1[i]==arr2[j]){
                printf("%d ",arr1[i]);
                found=1;
            }
        }
    }
        
    
    if (found==0){
        printf("there is not any common element");
    }
    return 0;
}