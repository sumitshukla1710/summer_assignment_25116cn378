import java.util.Scanner;
public class Problem86 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("please enter the string name: ");
        String name=input.nextLine();
        name=name.trim();

        int count=1;
        if(name.length()==0){
            System.out.println("the number of words = "+0);
            return;
        }
        for(int i=0;i<name.length();i++){
            char ch=name.charAt(i);
            if(ch==' '&& i<name.length()-1 && name.charAt(i+1)!=' ' ){
                count++;
                
            }
            
        
        }
        
        System.out.println("number of words = "+count);
        
    }
    
}
