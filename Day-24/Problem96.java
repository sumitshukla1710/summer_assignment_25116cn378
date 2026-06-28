//write program to remove duplicate character
import java.util.Scanner;
public class Problem96 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("please enter the string: ");
        StringBuilder s=new StringBuilder(input.nextLine());
        for(int i=0;i<s.length();i++){
            for(int j=i+1;j<s.length();j++){
                if(s.charAt(i)==s.charAt(j)){
                    s.delete(j, j+1);
                    j--;
                    
             
            }
            
        }
       

        
    }
    System.out.println(s);
    

    
}
}
