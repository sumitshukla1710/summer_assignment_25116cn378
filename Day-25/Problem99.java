//Program to sort names alphabetically

import java.util.Scanner;
public class Problem99 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("please enter the total names");
       int n=input.nextInt();
       input.nextLine();
       String[] arr=new String[n];
       System.out.println("please enter the names");
       for(int i=0;i<arr.length;i++){
        arr[i]=input.nextLine();
       }
      
       for(int i=0;i<arr.length;i++){
        for(int j=i+1;j<arr.length;j++){
        if(arr[i].compareToIgnoreCase(arr[j])>0){
            String temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;

        }
       }
    }System.out.println("names in sorted alphabetical order:");
for(int i=0;i<arr.length;i++){
    System.out.println(arr[i]);
}
        
    }
    
}
