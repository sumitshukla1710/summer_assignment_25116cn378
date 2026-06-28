//write program to check string rotation
import java.util.Scanner;
public class Problem93 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("please enter the first string: ");
        String s1=input.nextLine();
        System.out.println("please enter the second string:");
        String s2=input.nextLine();
        if(s1.length()!=s2.length()){
            System.out.println("not rotation of each other");
        }
        else{
            String temp=s1+s1;
            if(temp.contains(s2)){
                System.out.println("both strings are rotation of each other");
            }
            else{
                System.out.println("both strings are not rotation of each other");
            }
        }

    }

    
}
