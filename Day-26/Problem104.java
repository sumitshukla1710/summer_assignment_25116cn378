//created a quiz application with five multiple-choice questions,
// answer validation ,score calculation,and final result display.
import java.util.Scanner;
public class Problem104 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("enter your name:");
        String name=input.next();
        System.out.println(name+" welcome to java quiz...");
        System.out.println("=====your questions are given below=====");
        int marks=0;
        System.out.println("Question 1: which keyword is used to create an boject in java ?");
        System.out.print("1.class\n2.new\n3.static\n4.public\n");
        System.out.print("your answer: ");
        int answer1=input.nextInt();
        if(answer1==2){
            System.out.println("correct !");
            marks++;

        }
        else{
            System.out.println("incorrect !");
        }
        System.out.println("Question 2: which method is the entry point of a java program ?");
        System.out.print(   "1.start()\n2.run()\n3.main()\n4.init()\n");
        System.out.print("your answer: ");
        int answer2=input.nextInt();
        if(answer2==3){
            System.out.println("correct !");
            marks++;

        }
        else{
            System.out.println("incorrect !");
        }
        System.out.println("Question 3: Which data type stores whole numbers ?");
        System.out.print("1.double\n2.char\n3.int\n4.boolean\n");
        System.out.print("your answer: ");
        int answer3=input.nextInt();
        if(answer3==3){
            System.out.println("correct !");
            marks++;

        }
        else{
            System.out.println("incorrect !");
        }
        System.out.println("Question 4: which loop executes at least once?");
        System.out.print("1.for\n2.while\n3.do-while\n4.switch\n");
        System.out.print("your answer: ");
        int answer4=input.nextInt();
        if(answer4==3){
            System.out.println("correct !");
            marks++;

        }
        else{
            System.out.println("incorrect !");
        }
        System.out.println("Question 5: which class is used to take user input in java ?");
        System.out.print("1.random\n2.math\n3.Scanner\n4.string\n");
         System.out.print("your answer: ");
        int answer5=input.nextInt();
        if(answer5==3){
            System.out.println("correct !");
            marks++;

        }
        else{
            System.out.println("incorrect !");
        }
        System.out.println(name+" your final score out of 5 is "+marks);
    }
    
    
}
