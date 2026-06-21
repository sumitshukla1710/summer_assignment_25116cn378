//WRITE PROGRAM TO UNION OF ARRAYS
#include<stdio.h>
int main(){
    int n,m;
    printf("please enter the length of first array:");
    scanf("%d",&n);
    int arr1[n];
    printf("please enter the length of second array:");
     scanf("%d",&m);
    int arr2[m];
    int arr3[n+m];
    printf("please enter the elements of first array:");
    for(int i=0;i<n;i++){
        scanf("%d",&arr1[i]);
    }
    printf("please enter the elements of second array:");
    for( int i=0;i<m;i++){
        scanf("%d",&arr2[i]);
    }int k=0;
    for(int i=0;i<n;i++){
        arr3[k]=arr1[i];
        k++;
    }
    for(int i=0;i<m;i++){
       arr3[k]=arr2[i] ;
       k++;
    }
    
    printf("union of array is: \n");
    for(int i=0;i<m+n;i++){
        int duplicate=0;
        for(int j=0;j<i;j++){
            if(arr3[i]==arr3[j]){
                duplicate=1;
                break;
            }
        }
        if(duplicate==0){
            printf("%d ",arr3[i]);
        }
    }

    return 0;
}