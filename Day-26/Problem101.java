//number guessing game

import java.util.Random;
import java.util.Scanner;
public class Problem101{
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        Random random = new Random();
        int found=0;
        System.out.println("please enter the difficulty level: ");
        System.out.println("hard\nmoderate\neasy");
        String difficulty=input.next();
        int n=random.nextInt(20)+1;
        int p=random.nextInt(50)+1;
        int q=random.nextInt(100)+1;
        
        if(difficulty.equals("easy")){
            System.out.println("you got 5 chances..");
            
            for(int j=1;j<=5;j++){
                System.out.println("enter your guess between 1-20");
            int m=input.nextInt();
            if(m==n){
                System.out.println("congratulations you won...");
                found=1;
                break;
            }

            else if(m>n){
                System.out.println("bad luck ! enter lower number");
                continue;
            }
            else{
                System.out.println("bad luck! enter higher number");
                continue;
        }
    }

        }
        else if(difficulty.equals("moderate")){
            System.out.println("you got 3 chances");
            
            for(int k=1;k<=3;k++){
                System.out.println("please enter number between 1-50");
                int t=input.nextInt();

            if(t==p){
                System.out.println("congratulations you won...");
                found=1;
                break;
            }

            else if(t>p){
                System.out.println("bad luck ! enter lower number");
                continue;
            }
            else{
                System.out.println("bad luck! enter higher number");
                continue;
              }
            }
    }
    else if(difficulty.equals("hard")){
        System.out.println("you got 2 chances");
        
        for(int l=1;l<=2;l++){
            System.out.println("please enetr the number betwwn 1-100");
        int o=input.nextInt();

            if(o==q){
                System.out.println("congratulations you won...");
                found=1;
                break;
            }
            else if(o>q){
                System.out.println("bad luck ! please enter lower number");
                continue;
            }
            else{
                System.out.println("bad luck! please enter higher number");

            }
        }
    }
    else{
        System.out.println("invalid difficulty...");
    }
    if(found==0){
        System.out.println("you lost better luck next time....");
    }

    
}

    
}