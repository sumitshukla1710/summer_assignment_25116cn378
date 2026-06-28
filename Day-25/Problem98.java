//find common elements
import java.util.Scanner;
public class Problem98 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("please enter the first string: ");
        StringBuilder s1=new StringBuilder(input.nextLine());
       System.out.println("please enter the second string");
       StringBuilder s2=new StringBuilder(input.nextLine());
        int found=0;
        System.out.println("common chracters are:");
        for(int i=0;i<s1.length();i++){
            int duplicate=0;
            for(int k=0;k<i;k++){
                if(s1.charAt(i)==s1.charAt(k)){
                    duplicate=1;
                    break;
                }
            }
            if(duplicate==1){
                continue;
            }
            for(int j=0;j<s2.length();j++){
            
                if(s1.charAt(i)==s2.charAt(j) && s2.charAt(j) !='*'){
                 System.out.println(s1.charAt(i));
                 s2.setCharAt(j, '*');
                 found=1;
                 break;
                }
            }
        }
        if(found==0){
            System.out.println("no characters are found");
        }
        
    }
    
}
