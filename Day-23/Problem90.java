import java.util.Scanner;
public class Problem90 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("please enter the name of string:");
        String name=input.nextLine();
        System.out.println("first repeating character = "+firstrepeating(name));

        
    }
    public static char firstrepeating(String name){
        for(int i=0;i<name.length();i++){
            int count=0;
            for(int j=i+1;j<name.length();j++){
                if(name.charAt(i)==name.charAt(j)){
                    count++;
                }
            }
            if(count!=0){
                return name.charAt(i);
            }
        }
        return '\0';
    }
    
}
