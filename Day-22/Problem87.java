import java.util.Scanner;
public class Problem87 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("please enter the name of string: ");
        StringBuilder name=new StringBuilder(input.nextLine());
        for(int i=0;i<name.length();i++){
            int count=1;
            
            
            for(int j=i+1;j<name.length();j++){
                if(name.charAt(i)==name.charAt(j) && name.charAt(i)!='*'){
                    count++;
                    
                    name.setCharAt(j,'*');
                   
                    
                }


            }
            if(name.charAt(i)=='*'){
                continue;
            }
            
            System.out.println(name.charAt(i)+" = "+count);
        }
        
    }
    
}
