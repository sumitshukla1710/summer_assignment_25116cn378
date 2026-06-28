/*Developed a menu-driven ATM simulation with balance inquiry,deposit,withdraw,and exit 
functionality using switch and while loop.
 */

import java.util.Scanner;
public class Problem103 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        
        int currentbalance=10000000;
        boolean running=true;
         
         while(running){
            System.out.println("=====ATM MENU=====\n1.check balance\n2.Deposit\n3.withdraw\n4.exit");
        System.out.println("please enter your choice..");
         int n=input.nextInt();
        switch(n){
            case 1:
                System.out.println("your current balance is "+currentbalance);
                break;
            case 2:
                System.out.println("enter amount you want to deposit..");
                int amount=input.nextInt();
                currentbalance=currentbalance+amount;
                System.out.println("your current balance "+currentbalance);
                break;
            case 3:
                System.out.println("enter amount you want to withdraw..");  
                int withdraw=input.nextInt();
                if(withdraw>currentbalance)   {
                    System.out.println("insufficient balance");
                } 
                else{
                    currentbalance = currentbalance-withdraw;
                    System.out.println("your current balance "+currentbalance);
                } 
                break;
            case 4: 
               System.out.println("thank you for visiting");    
               running=false;
               break;
               default:
                System.out.println("invalid choice!");

        }
    
        }
    
}
}