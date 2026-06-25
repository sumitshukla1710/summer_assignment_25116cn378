import java.util.Scanner;
public class Problem84 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("please enter the string: ");
        StringBuilder s=new StringBuilder(input.nextLine());
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(ch>='a' && ch<='z'){
                s.setCharAt(i,(char)(ch-32));
            }
        }
        System.out.println("UPPERCASE = "+s);

        
    }
    
}
