//INTERSECTION
#include <stdio.h>

int main()
{
    int n1, n2;
    int arr1[100], arr2[100];
    printf("please enter the number of elements of first array:");
    scanf("%d", &n1);
    printf("please enter the elements of the first array:");
    for(int i = 0; i < n1; i++)
    {
        scanf("%d", &arr1[i]);
    }
    printf("please enter the number of elements of second array:");
    scanf("%d", &n2);
    printf("please enter the elements of the second array:");
    for(int i = 0; i < n2; i++)
    {
        scanf("%d", &arr2[i]);
    }
    int found=0;
    printf("Intersection = ");

    for(int i = 0; i < n1; i++)
    {
        int duplicate = 0;

        for(int k = 0; k < i; k++)
        {
            if(arr1[i] == arr1[k])
            {
                duplicate = 1;
                
                break;
            }
        }

        if(duplicate)
        {
            continue;
        }

        for(int j = 0; j < n2; j++)
        {
            if(arr1[i] == arr2[j])
            {
                printf("%d ", arr1[i]);
                found=1;
                break;
            }
        }
    }
    if(found==0){
        printf("there is not any common array:");
    }

    return 0;
}