//selection sorting..
import java.util.Scanner;
public class Problem70 {

    public static void main(String [] args){
        Scanner input=new Scanner(System.in);
        System.out.println("please enter the length of the array: ");
        int n=input.nextInt();
        int[] arr=new int[n];
        System.out.println("please enter the length of the array:");
        for(int i=0;i<n;i++){
            arr[i]=input.nextInt();
        }
        for(int i=0;i<n-1;i++){
            int smallest=i;
            for(int j=i+1;j<n;j++){
                if(arr[j]<arr[smallest]){
                    smallest=j;
                }

            }
            int temp=arr[smallest];
            arr[smallest]=arr[i];
            arr[i]=temp;
        }
for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }

    }
    
}
