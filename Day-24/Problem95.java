//write program to find longest word
import java.util.Scanner;
public class Problem95 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("please enter the string");
        String s=input.nextLine();
       s= s.trim();
        int max=0;
        int n=0;
        int m=0;
        for(int i=0;i<s.length();i++){
            int count=1;
            int j=i+1;
            while(j<s.length() && s.charAt(j)!=' ' ){
                count++;
                j++;

            }
            if(count>max){
                max=count;
                n=i;
                m=j-1;;

            }
             i=j-1;

        }
        System.out.println("the maximum possible word is: ");
        printlongestword(s,n,m);
        
    }
    public static void printlongestword(String s,int n,int m){
        for(int i=n;i<=m;i++){
            System.out.print(s.charAt(i));
        }
        return ;

    }
}
