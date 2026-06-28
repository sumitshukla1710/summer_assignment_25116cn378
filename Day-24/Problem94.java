//write program to compress string
import java.util.Scanner;
public class Problem94 {
    public static void main(String[] args) {
            Scanner input=new Scanner(System.in);
            System.out.println("please enter the string: ");
            StringBuilder s=new StringBuilder(input.nextLine());
            for(int i=0;i<s.length();i++){
                int count=1;
                int j=i+1;
                
               while( j<s.length() && s.charAt(i)==s.charAt(j)){
                    
                        count++;
                    j++;
                
                }
                
                System.out.print(s.charAt(i)+""+count);
                i=j-1;
                
            }
        
    }


    
}
