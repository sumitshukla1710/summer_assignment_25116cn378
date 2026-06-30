//Student record management system..

import java.util.ArrayList;
import java.util.Scanner;
class Student{
    String name;
    int rollno;
    double marks;
    
    Student(String name,int rollno,double marks){
       this. name=name;
       this.rollno=rollno;
       this.marks=marks;

    }
    void print(){
        System.out.println(name+"\n"+rollno+"\n"+marks);    
        System.out.println("-----------------------------------------------");
    }

}
public class Problem105{
        public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        ArrayList<Student> students=new ArrayList<>(); 
        boolean Continue=true;
        while(Continue){
            System.out.println("======STUDENT RECORD MANAGEMENT SYSTEM=====");
            System.out.println("1.add student                             |");
            System.out.println("2.display student                         |");
            System.out.println("3.search student                          |");
            System.out.println("4.update student.                         |");
            System.out.println("5.delete student                          |");
            System.out.println("6.exit                                    |");
            System.out.println("===========================================");
            System.out.println("enter your choice");
            int choice=input.nextInt();
            input.nextLine();
            switch(choice){
                case 1:
                    System.out.println("enter name :");
                   String name= input.nextLine();
                   System.out.println("enter rollno :");
                   int rollno=input.nextInt();
                   System.out.println("enter marks :");
                   double marks=input.nextDouble();
                   input.nextLine();
                   students.add(new Student(name,rollno,marks));
                   System.out.println("student added successfully !");
                   break;
                case 2:
                    if(students.isEmpty()){
                        System.out.println("no records found ");
                    }
                    else{
                        for(Student s:students){
                            s.print();
                        }
                    }
                    break;
                case 3:
                    System.out.println("enter roll no to search");
                    int roll=input.nextInt();
                    boolean found=false;
                    for(Student s:students){
                        if(s.rollno==roll){
                            s.print();
                            found=true;
                            break;
                        }
                    }
                    if(found==false){
                        System.out.println("student not found");
                    }
                    break;
                case 4:
                    System.out.println("enter roll no to update");
                    int rollupdate=input.nextInt();
                    input.nextLine();
                    found =false;
                    for(Student s:students){
                        if(s.rollno==rollupdate){
                            System.out.println("enter new name");
                            s.name=input.nextLine();
                            System.out.println("enter new roll no");
                            s.rollno=input.nextInt();
                            input.nextLine();
                            System.out.println("enter new marks");
                            s.marks=input.nextDouble();
                            System.out.println("record updated !");
                            found =true;
                            break;

                        }
                    }
                    if(!found){
                        System.out.println("student not found !");
                    }
                    break;
                case 5:
                    System.out.println("enter roll no for delete");    
                    int rolldelete=input.nextInt();
                    
                    found =false;
                    for(int i=0;i<students.size();i++){
                        if(students.get(i).rollno==rolldelete){
                            students.remove(i);
                            System.out.println("record deleted sucessfully :");
                            found=true;
                            break;
                        }

                    }
                    if(found==false){
                        System.out.println("student not found");

                    }
                    break;
                case 6:
                    System.out.println("thank you !");  
                    Continue =false; 
                    break;
                default :
                System.out.println("invalid choice..");     





            }

        }


    }

}