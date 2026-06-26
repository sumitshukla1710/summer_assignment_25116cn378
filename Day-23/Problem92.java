import java.util.Scanner;
public class Problem92 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("please enter the string:");
        String name=input.nextLine();
        System.out.println("maximum occuring character is = "+maxoccuring(name));
        
    }
    public static char maxoccuring(String name){
        int max=0;
        char ch=' ';
        for( int i=0;i<name.length();i++){
            int count=0;
            for(int j=0;j<name.length();j++){
                if(name.charAt(i)==name.charAt(j)){
                    count++;
                }
            }
            if(count>max){
                max=count;
                ch=name.charAt(i);

            }
        }
        return ch;
    }
    
}

