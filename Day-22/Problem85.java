import java.util.Scanner;
public class Problem85 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("enter the string:");
        String name=input.nextLine();
        int i=0;
        int j=name.length()-1;
        int found=1;
        while(i<=j){
            if(name.charAt(i)!=name.charAt(j)){
                found=0;
                break;
            }
            i++;
            j--;

        }
        if(found==0){
            System.out.println("not palindrome");
        }
        else{
            System.out.println("palindrome");
        }
        
        
    }
    
}
