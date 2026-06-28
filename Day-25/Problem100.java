//write program to sort words by length
import java.util.Scanner;
public class Problem100 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("please enter the name of strings");
        String name=input.nextLine();
        String [] words=name.split(" \\s+");
        for(int i=0;i<words.length;i++){
            for(int j=i+1;j<words.length;j++){
                if(words[i].length()>words[j].length()){
                    String temp=words[i];
                    words[i]=words[j];
                    words[j]=temp;
                }
            }
        }
        System.out.println("sorted words by length..");
        for(int i=0;i<words.length;i++){
            System.out.println(words[i]);
        }
        
    }

    
}
