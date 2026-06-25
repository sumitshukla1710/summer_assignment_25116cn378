import java.util.Scanner;
public class Problem81 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("enter the string: ");
        String s=input.nextLine();
        int count=0;
        try{
            while(true){
                s.charAt(count);
                count++;
            }
        } catch(Exception e){

        }
        System.out.println("length = "+count);
        
        
    }

    
}
