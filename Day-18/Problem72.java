// sorting in decending order..
import java.util.Scanner;
public class Problem72 {
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        System.out.println("pleae enetr the length of the array: ");
        int n=input.nextInt();
        int [] arr=new int[n];
        System.out.println("please enter the elements of the array: ");
        for( int i=0;i<n;i++){
        arr[i]=input.nextInt();
        }
        for(int i=0;i<n-1;i++){
            for(int j=0;j<n-1-i;j++){
                if(arr[j]<arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }

    }
    
}
