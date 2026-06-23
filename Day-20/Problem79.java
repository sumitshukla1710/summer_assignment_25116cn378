//row wise sum
import java.util.Scanner;
public class Problem79 {
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        System.out.println("please enter the number of rows: ");
        int r=input.nextInt();
        System.out.println("please enter the number of columns: ");
        int c=input.nextInt();
        int[][] arr=new int[r][c];
        System.out.println("please enter the elemnets of the array:");
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                arr[i][j]=input.nextInt();
            }
        }
        for(int i=0;i<r;i++){
            int sum=0;
            for(int j=0;j<c;j++){
                sum=sum+arr[i][j];
            }
            System.out.println("the sum of elements of "+(i+1)+" row is "+sum);
        }

    }
    
}
