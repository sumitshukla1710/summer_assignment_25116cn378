import java.util.Scanner;
public class Problem83 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("please enter the string:");
        String s=input.nextLine();
        int vowels=0;
        int consonants=0;
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if((ch>='a' && ch<='z') || (ch>='A' && ch<='Z')){

                if(ch=='a' || ch=='A' || ch=='e' || ch=='E'|| ch=='i' || ch=='I' || ch=='O' || ch=='o' || ch=='u' || ch=='U'){
                    vowels++;
                }
                else{
                    consonants++;
                }
            }
        }
        System.out.println("Vowels = "+vowels +" consonants = "+consonants);
        
    }

    
}
