//multiplication of matrix
import java.util.Scanner;
public class Problem77 {
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        System.out.println("please enter the row of the first matrix: ");
        int r1=input.nextInt();
        System.out.println("please enter the column of the first matrix: ");
        int c1=input.nextInt();
        int[][] arr1=new int[r1][c1];
        
        System.out.println("please enter the row of the second matrix: ");
        int r2=input.nextInt();
        System.out.println("please enter the column of the second matrix: ");
        int c2=input.nextInt();
        int[][] arr2=new int[r2][c2];
        
        if(c1!=r2){
            System.out.print("multiplication is not pssible.");
            return;
        }
        else{
            System.out.println("please enter the elemens of the first matrix: ");
        for(int i=0;i<r1;i++){
            for(int j=0;j<c1;j++){
                arr1[i][j]=input.nextInt();
            }
            
        }
        System.out.println("please enter the elemens of the second matrix: ");
        for(int i=0;i<r2;i++){
            for(int j=0;j<c2;j++){
                arr2[i][j]=input.nextInt();
            }
            
        }
        int [][] result=new int[r1][c2];
        for(int i=0;i<r1;i++){
            for(int j=0;j<c2;j++){
                 result[i][j]=0;
                 for(int k=0;k<c1;k++){
                    result[i][j]=result[i][j]+arr1[i][k]*arr2[k][j];
                 }
            }
        }
        System.out.println("resultant matrix: ");
        for(int i=0;i<r1;i++){
            for(int j=0;j<c2;j++){
                System.out.print(result[i][j]+" ");
            }
            System.out.println();
        }
        }
         


        }


    }
    


