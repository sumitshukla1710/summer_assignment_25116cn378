//Marksheet generation system

import java.util.ArrayList;
import java.util.Scanner;
class Student{
    
    String name;
    int rollno;
    double maths;
    double physics;
    double chemistry;
    double computer;
    double english;
    double total;
    double percentage;
    String grade;
    Student(String name,int rollno,double maths,double physics,double chemistry,double computer,double english){
        this.name=name;
        this.rollno=rollno;
        this.maths=maths;
        this.physics=physics;
        this.chemistry=chemistry;
        this.computer=computer;
        this.english=english;
        total=maths+physics+chemistry+computer+english;
        percentage=(maths+physics+chemistry+computer+english)/5;
        if(percentage>=90){
            grade="A+";
        }
        else if(percentage<90 && percentage>=80){
            grade="A";
        }
        else if(percentage<80 && percentage>=70){
            grade="B";
        }
        else if(percentage<70 && percentage>=60){
            grade="C";
        }
        else if(percentage<60 && percentage>=50){
            grade="D";
        }
        else{
            grade="Fail";
        }
    }
    void print(){
        System.out.println("name: "+name);
        System.out.println("rollno: "+rollno);
        System.out.println("maths: "+maths);
        System.out.println("physics: "+physics);
        System.out.println("chemistry: "+chemistry);
        System.out.println("computer: "+computer);
        System.out.println("english: "+english);
        System.out.println("total: "+total);
        System.out.println("percentage: "+percentage);
        System.out.println("grade: "+grade);
        System.out.println("------------------------------------------------------------");
    }


}
public class Problem108 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        ArrayList<Student> Students=new ArrayList<>();
        boolean Continue=true;
        while(Continue){
        System.out.println("======MARKSHEET GENERATION SYSTEM=====");
        System.out.println("1.Add student.                        | ");
        System.out.println("2.Display marksheet.                  |");
        System.out.println("3.Search student.                     |");
        System.out.println("4.Update student.                     |");
        System.out.println("5.Delete student.                     |");
        System.out.println("6.Exit.                               |");
        System.out.println("=======================================");
        System.out.println("enter your choice..");
        int choice=input.nextInt();
        input.nextLine();
        switch(choice){
            case 1:
                System.out.println("enter student name: ");
                String name=input.nextLine();
                System.out.println("enter student rollno: ");
                int rollno=input.nextInt();
                System.out.println("enter marks of maths: ");
                double maths=input.nextDouble();
                System.out.println("enter marks of physics: ");
                double physics=input.nextDouble();
                System.out.println("enter marks of chemistry: ");
                double chemistry=input.nextDouble();
                System.out.println("enter marks of computer: ");
                double computer=input.nextDouble();
                System.out.println("enter marks of english: ");
                double english=input.nextDouble();
                Students.add(new Student(name,rollno,maths,physics,chemistry,computer,english));
                System.out.println("Record added successfully !");
                break;
            case 2:
                if(Students.isEmpty()){
                    System.out.println("Record not found !");
                    break;
                }
                else{
                    for(int i=0;i<Students.size();i++){
                        Students.get(i).print();
                    }
                    break;
                }
            case 3:
                System.out.println("enter student rollno for search: ");     
                int rollno1=input.nextInt();
                boolean found=false;
                 for(int i=0;i<Students.size();i++){
                       if(rollno1==Students.get(i).rollno){
                        Students.get(i).print();
                        found=true;
                        break;
                       }
                    }
                if(!found)    {
                    System.out.println("Incorrect rollno.");
                }
                break;
            case 4:
                System.out.println("enter student roll no for update: ");
                int rollup=input.nextInt();
                input.nextLine();
                boolean found1=false;
                 for(int i=0;i<Students.size();i++){
                        if(rollup==Students.get(i).rollno){
                            System.out.println("enter new name: ");
                            Students.get(i).name=input.nextLine();
                            System.out.println("enter new roll no: ");
                            Students.get(i).rollno=input.nextInt();
                            System.out.println("enter new marks of maths: ");
                            Students.get(i).maths=input.nextDouble();
                            System.out.println("enter new marks of physics: ");
                            Students.get(i).physics=input.nextDouble();
                            System.out.println("enter new marks of chemistry: ");
                            Students.get(i).chemistry=input.nextDouble();
                            System.out.println("enter new marks of computer: ");
                            Students.get(i).computer=input.nextDouble();
                            System.out.println("enter new marks of english: ");
                            Students.get(i).english=input.nextDouble();
                            Students.get(i).total=Students.get(i).maths+Students.get(i).physics+Students.get(i).chemistry+Students.get(i).computer+Students.get(i).english;
                            Students.get(i).percentage=(Students.get(i).total)/5;
                            input.nextLine();
                            if(Students.get(i).percentage>=90){
                                     Students.get(i).grade="A+";
                            }
                            else if(Students.get(i).percentage<90 && Students.get(i).percentage>=80){
                                      Students.get(i).grade="A";
                            }
                            else if(Students.get(i).percentage<80 && Students.get(i).percentage>=70){
                                      Students.get(i).grade="B";
                            }
                            else if(Students.get(i).percentage<70 && Students.get(i).percentage>=60){
                                      Students.get(i).grade="C";
                            }
                            else if(Students.get(i).percentage<60 && Students.get(i).percentage>=50){
                                      Students.get(i).grade="D";
                            }
                            else{
                                      Students.get(i).grade="Fail";
                            }
                            System.out.println("Record updated successfully !");
                            found1=true;
                            break;
                         }
        
                         }
                         if(!found1){
                            System.out.println("Incorrect rollno.");
                         }
                         break;
        case 5:
            System.out.println("enter roll no for removing students: ");
            int remroll=input.nextInt();
            boolean found2=false;
            for(int i=0;i<Students.size();i++){
                if(remroll==Students.get(i).rollno){
                    Students.remove(i);
                    found2=true;
                    System.out.println("Student deleted successfully !");
                    break;
                }
            }
            if(!found2){
                System.out.println("Incorrect roll no ! Try again.");
            }
            break;
        case 6:
            System.out.println("Thank you !");   
            Continue=false;
            break;
        default :
        System.out.println("invalid choice....");     

    
}
      
}
   
}
}