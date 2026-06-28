//merge 2 sorted array
import java.util.Scanner;
public class Problem97 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("pleaze enter the length of first sorted array:");
        int n=input.nextInt();
        int[] arr1=new int[n];
        System.out.println("enter the first sorted array");
        for(int i=0;i<n;i++){
            arr1[i]=input.nextInt();
        }
        System.out.println("please enter the length of second sorted array:");
        int m=input.nextInt();
        int[] arr2=new int[m];
        System.out.println("enter the second sorted array:");{
            for(int i=0;i<m;i++){
            arr2[i]=input.nextInt();
        }
        }
        
        int p=m+n;
        int[] arr3=new int[p];
        int k=0,i=0,j=0;
        while(i<arr1.length && j<arr2.length){
            if(arr1[i]<arr2[j]){
                arr3[k]=arr1[i];
                i++;
                k++;
            }
            else{
                arr3[k]=arr2[j];
                j++;
                k++;

            }

        }
        while(i<arr1.length){
            arr3[k]=arr1[i];
            i++;
            k++;
        }
        while(j<arr2.length){
            arr3[k]=arr2[j];
            j++;
            k++;
        }
        for(int l=0;l<arr3.length;l++){
            System.out.print(arr3[l]+" ");
        }
    }


    
}
