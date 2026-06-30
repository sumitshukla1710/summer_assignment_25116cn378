//employee management system

import java.util.ArrayList;
import java.util.Scanner;
class Employee{
    String name;
    int id;
    double salary;
 
Employee(String name,int id,double salary){
    this.name=name;
    this.id=id;
    this.salary=salary;

}
void print(){
    System.out.println("name: "+name+"\nid: "+id+"\nsalary: "+salary);
    System.out.println("--------------------------------------------------");
}
}
public class Problem106 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        ArrayList<Employee> employees=new ArrayList<>();
        boolean Continue=true;
        while(Continue){
            System.out.println("=====WELCOME TO EMPLOYEE MANAGEMENT SYSTEM=====");
            System.out.println("1.Add employee.                                |");
            System.out.println("2.Display employee.                            |");
            System.out.println("3.search employee.                             | ");
            System.out.println("4.update employee.                             |");
            System.out.println("5.Remove employee.                             |");
            System.out.println("6.exit.                                        |");
            System.out.println("================================================");
            System.out.print("enter your choice:");
            int choice=input.nextInt();
            input.nextLine();
            switch(choice){
                case 1:
                    System.out.println("enter name of employee: ");
                    String name=input.nextLine();
                    System.out.println("enter id of employee: ");
                    int id=input.nextInt();
                    System.out.println("enter salary of employee: ");
                    double salary=input.nextDouble();
                    input.nextLine();
                    
                    employees.add(new Employee(name,id,salary));
                    System.out.println("record added successfully !");
                    break;
                case 2:
                    if(employees.isEmpty()) {
                        System.out.println("no record found !");
                        break;
                    }
                    else{
                        for(int i=0;i<employees.size();i++){
                            employees.get(i).print();
                            
                        }
                        break;
                    }
                case 3:
                    System.out.println("enter id of employee you want to search.");       
                    int id1=input.nextInt();
                    input.nextLine();
                    boolean found=false;
                    for( int i=0;i<employees.size();i++){
                        
                          if(employees.get(i).id==id1){
                            employees.get(i).print();
                            found=true;
                            break;
                          }
                    
                     }
                    if(!found){
                           System.out.println("record not found !");
            }
                              break;

                case 4:
                    System.out.println("enter employee id for update");
                    int upid=input.nextInt();
                    input.nextLine();
                    boolean found1=false;
                    for(int i=0;i<employees.size();i++){
                        if(employees.get(i).id==upid){
                            System.out.println("enter  new name of employee: ");   
                         employees.get(i).name=input.nextLine();
                         System.out.println("enter new id: ");
                         employees.get(i).id=input.nextInt();
                         System.out.println("enter salary");
                         employees.get(i).salary=input.nextDouble();
                         input.nextLine();
                         found1=true;
                         System.out.println("record updated !");
                         break;
                        }

                    }
                    if(!found1){
                        System.out.println("id not found !");
                    }
                    break;
                case 5:
                    System.out.println("enter id of employee you want to remove.");
                    int deleteid=input.nextInt();
                    boolean found2=false;
                    for(int i=0;i<employees.size();i++){
                    if(deleteid==employees.get(i).id){
                        employees.remove(i);
                        found2=true;
                        System.out.println("record deleted successfully !");
                        break;
                    }
                    }
                    if(!found2){
                        System.out.println("enter valid id !");
                    }
                    break;
                case 6:{
                    System.out.println("thank you !");
                    Continue=false;
                } 
                default:{
                    System.out.println("Enter valid choice !");
                }   

                 
        }
    }
}
}
