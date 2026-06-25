import java.util.Scanner;
public class Problem82{
public static void main(String[] args){
    Scanner input=new Scanner(System.in);
    System.out.println("please enter the  string:");
    StringBuilder s=new StringBuilder(input.nextLine());
    int j=s.length()-1;
    for(int i=0;i<s.length()/2;i++){
        char ch=s.charAt(i);
        char ch2=s.charAt(j);
        s.setCharAt(i,ch2);
        s.setCharAt(j,ch);
        j--;

    }
    System.out.println(s);
    
}
}