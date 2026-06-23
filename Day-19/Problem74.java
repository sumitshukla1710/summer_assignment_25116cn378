import java.util.Scanner;
public class Problem74 {
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        System.out.println("please enter the row of the first matrix: ");
        int r1=input.nextInt();
        System.out.println("please enter the column of the first matrix: ");
        int c1=input.nextInt();
        int[][] arr1=new int[r1][c1];
        System.out.println("please enter the elemens of the first matrix: ");
        for(int i=0;i<r1;i++){
            for(int j=0;j<c1;j++){
                arr1[i][j]=input.nextInt();
            }
            
        }
        System.out.println("please enter the row of the second matrix: ");
        int r2=input.nextInt();
        System.out.println("please enter the column of the second matrix: ");
        int c2=input.nextInt();
        int[][] arr2=new int[r2][c2];
        System.out.println("please enter the elemens of the second matrix: ");
        for(int i=0;i<r1;i++){
            for(int j=0;j<c1;j++){
                arr2[i][j]=input.nextInt();
            }
            
        }
        if(r1!=r2 || c1!=c2){
            System.out.println("subtraction is not possible.");
        }
        else{
         int[][] arr3=new int[r1][c1];
         
         for(int i=0;i<r1;i++){
            for(int j=0;j<c1;j++){
                arr3[i][j]=arr1[i][j]-arr2[i][j];
            }
         }
         System.out.println("the resultant matrix: ");
         for(int i=0;i<r1;i++){
            for(int j=0;j<c1;j++){
                System.out.print(arr3[i][j]+" ");
            }
            System.out.println();
         }


        }


    }
    
}
