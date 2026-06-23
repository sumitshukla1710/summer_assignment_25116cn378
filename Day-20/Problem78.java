//checking symmetry of matrix..
import java.util.Scanner;
public class Problem78 {
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        System.out.println("please enter the number of raws:");
        int r=input.nextInt();
         System.out.println("please enter the number of columns:");
        int c=input.nextInt();
        
        int[][] arr=new int[r][c];
        if(r!=c){
            System.out.println("enter equal number of rows and columns:");
            return;
        }
        else{
            System.out.println("please enter the elements of the matrix:");
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
            arr[i][j]=input.nextInt();
        }

    }
    int[][] arr2=new int[c][r];
     for(int j=0;j<c;j++){
        for(int i=0;i<r;i++){
            arr2[j][i]=arr[i][j];

        }
     }
     int found=1;
     for(int i=0;i<r;i++){
        for(int j=0;j<c;j++){
            if(arr[i][j]!=arr2[i][j]){
              found=0;
            }
        }
     }
     if(found==1){
        System.out.println("matrix is symmetric");
     }
     else{
        System.out.println("matrix is not symmetric");
     }
    }

    }
    
}
