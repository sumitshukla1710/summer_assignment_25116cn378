import java.util.Scanner;
public class Problem75 {
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        System.out.println("please enter the row of the first matrix: ");
        int r=input.nextInt();
        System.out.println("please enter the column of the first matrix: ");
        int c=input.nextInt();
        int[][] arr=new int[r][c];
        System.out.println("please enter the elemens of the first matrix: ");
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                arr[i][j]=input.nextInt();
            }
            
        }
        System.out.println("your matrix:");

            for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
            
        }
        System.out.println("transepose of your matrix: ");
        for(int j=0;j<c;j++){
            for(int i=0;i<r;i++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
            
        }
       
         


        }


    }
    


