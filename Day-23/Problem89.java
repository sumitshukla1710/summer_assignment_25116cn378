import java.util.Scanner;
public class Problem89{
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("please enter the string");
        String name=input.nextLine();
        System.out.println("first non repeating caharacater is = "+firstnonrepeating(name));
        
        
            
        
        
    }
    public static char firstnonrepeating(String name){
        for(int i=0;i<name.length();i++){
            int count=0;
            for(int j=0;j<name.length();j++){
                if(name.charAt(i)==name.charAt(j)){
                    count++;
                }
            }
            if(count==1){
                return name.charAt(i);
            }

        }
        return '\0';
    }
}