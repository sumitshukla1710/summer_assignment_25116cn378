import java.util.Scanner;
public class Problem88 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("please enter the string:" );
        StringBuilder name=new StringBuilder(input.nextLine());
        for(int i=0;i<name.length();i++){
            if(name.charAt(i)==' '){
                name.delete(i,i+1);
                i--;
            }
        }
        System.out.println(name);
        
    }
    
}
