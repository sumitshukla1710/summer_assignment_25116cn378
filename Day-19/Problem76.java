import java.util.Scanner;
public class Problem76 {
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
        if(r!=c){
            System.out.println("please enter the square matrix for sum of diagonal.");
            return;
        }
        else{
        
        int sum=0;
       
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                if(i==j|| i+j==r-1){
                sum=sum+arr[i][j];
                }
            }
            
            
        }
    
        System.out.println("the sum of diagonal elements of matrix is: "+sum);
    }
       
         

        }


    }
    


