//voting eligibility system

import java.util.Scanner;
public class Problem102 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("please enter your name:");
        String name=input.nextLine();
        System.out.println("please enter your age:");
        int age=input.nextInt();
        if(age<0){
            System.out.println("invalid age");
        }
       else if(age<18){
            System.out.println(name+" you are not eligible to vote");
        }
        else {
            System.out.println("congratulations "+name+" you are eligible to vote");
        }
    }
    
}
