//WRITE PROGRAM TO CREATE SALARY MANAGEMENT SYSTEM..

import java.util.ArrayList;
import java.util.Scanner;
class Employee{
    int id;
    String name;
    double basicsalary;
    double hra;
    double da;
    double totalsalary;
    Employee(int id,String name,double basicsalary){
        this.id=id;
        this.name=name;
        this.basicsalary=basicsalary;
        hra=basicsalary*0.20;
        da=basicsalary*0.10;
        totalsalary=basicsalary+hra+da;
    
    }
    void print(){
        System.out.println("Employee id: "+id+"\nEmployee name: "+name+"\nbasicsalary: "+basicsalary+"\nhra: "+hra+"\nda: "+da+"\ntotalsalary: "+totalsalary);
        System.out.println("------------------------------------------------------------------------------------------------------------------------------");
    }

}
public class Problem107 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        ArrayList<Employee> employees=new ArrayList<>();
        boolean Continue=true;
        while(Continue){
            System.out.println("======SALARY MANAGEMENT SYSTEM======");
            System.out.println("1.Add employee.                     |");
            System.out.println("2.Display salary details.           |");
            System.out.println("3.Search employee.                  |");
            System.out.println("4.Update employee salary.           |");
            System.out.println("5.Delete employee.                  |");
            System.out.println("6.Exit.                             |");
            System.out.println("=====================================");
            System.out.println("enter your choice");
            int choice=input.nextInt();
            switch(choice){
                case 1:
                    System.out.println("Enter id of employee: ");
                    int id=input.nextInt();
                    input.nextLine();
                    System.out.println("Enter name of employee:  ");
                    String name=input.nextLine();
                    System.out.println("Enter the basic salary of employee: ");
                    double basicsalary=input.nextDouble();
                    input.nextLine();
                    employees.add(new Employee(id, name, basicsalary));
                    System.out.println("information added successfully.");
                    break;
                case 2:
                    if(employees.isEmpty()){
                        System.out.println("No record found.");
                        break;
                    }
                    else{
                        for(int i=0;i<employees.size();i++){
                            employees.get(i).print();

                        }
                        break;
                        
                    }   
                case 3:
                    System.out.println("enter id of employee you want to search.."); 
                    int id1=input.nextInt() ;
                    boolean found=false;
                    for(int i=0;i<employees.size();i++){
                        if(id1==employees.get(i).id){
                            employees.get(i).print();
                            found=true;
                            break;
                        }
                    }
                    if(!found){
                        System.out.println("enter valid id !");
                    }  
                    break;
                case 4:
                    System.out.println("enter the id of employee.");
                    int id2=input.nextInt();
                    boolean found1=false;
                     for(int i=0;i<employees.size();i++){
                        if(id2==employees.get(i).id){
                            System.out.println("Enter new id");
                            employees.get(i).id=input.nextInt();
                            input.nextLine();
                            System.out.println("Enter new name of employee");
                            employees.get(i).name=input.nextLine();
                            System.out.println("Enter new basic salary");
                            employees.get(i).basicsalary=input.nextDouble();
                            input.nextLine();
                            employees.get(i).hra = employees.get(i).basicsalary * 0.20;
                            employees.get(i).da = employees.get(i).basicsalary * 0.10;
                            employees.get(i).totalsalary =employees.get(i).basicsalary + employees.get(i).hra +employees.get(i).da; 
        
       
        
                            System.out.println("your new information is updated successfully..");
                            found1=true;
                            break;
                        }
                    }
                    if(!found1){
                        System.out.println("enter valid id for update empoyee salary");
                    }
                    break;
                case 5:
                    System.out.println("enter id of emplyee for removing him."); 
                    int remoid=input.nextInt();
                    input.nextLine();
                    boolean found2=false;
                     for(int i=0;i<employees.size();i++){
                        if(remoid==employees.get(i).id){
                            employees.remove(i);
                            System.out.println("employee deleted successfully");
                            found2=true;
                            break;
                        }
                    }
                    if(!found2){
                        System.out.println("id not found !");
                    }
                    break;
                case 6:
                    System.out.println("Thank you !!");    
                    Continue=false;
                    break;
                default :
                System.out.println("invalid choice.");    



            }
        }
        
    }

    
}

