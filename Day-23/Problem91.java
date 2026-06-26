import java.util.Arrays;
import java.util.Scanner;
public class Problem91 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("please enter the first string:");
        String str1=input.nextLine();
        System.out.println("please enter the second string:");
        String str2=input.nextLine();
        System.out.println(isanagram(str1,str2));
    }
    public static boolean isanagram(String str1,String str2){
       str1= str1.replaceAll("\\s","");
       str2= str2.replaceAll("\\s","");


        if(str1.length()!=str2.length()){
            return false;
        }
        else{
         char c1 [] =   str1.toLowerCase().toCharArray();
          char  c2 []=  str2.toLowerCase().toCharArray();
          Arrays.sort(c1);
          Arrays.sort(c2);
          return Arrays.equals(c1,c2);

        }
        
    }
    
}
