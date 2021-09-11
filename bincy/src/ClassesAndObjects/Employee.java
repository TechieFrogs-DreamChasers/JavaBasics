package ClassesAndObjects;

import java.util.Scanner;

public class Employee { // 10.Printing Employee details
    String name;
    int yearOfJoining;
    double salary;
    String address;

    void getDetails(Scanner obj){
        System.out.println("Enter employee name: ");
        name = obj.nextLine();
        System.out.println("Enter year of joining: ");
        yearOfJoining = obj.nextInt();
        System.out.println("Enter salary: ");
        salary = obj.nextDouble();
        System.out.println("Enter address : ");
        obj.nextLine();
        address = obj.nextLine();
    }

    void showDetails(){
        System.out.println(name +"        "+ yearOfJoining +"            "+ salary +"      "+ address);

    }

    public static void main(String[] args){
        Scanner obj = new Scanner(System.in);
        Employee emp1 = new Employee();
        Employee emp2 = new Employee();
        Employee emp3 = new Employee();
        //Employee emp1 = new Employee("Robert",1994,98000.00,"64C-WALLStreet");
        //Employee emp2 = new Employee("Sam",2000,80000.00,"68D- WallStreet");
        //Employee emp3 = new Employee("John",1999,89000.00,"26B-WallsStreat");
        emp1.getDetails(obj);
        emp2.getDetails(obj);
        emp3.getDetails(obj);
        System.out.println("Name       Year Of Joining     Salary      Address");
        emp1.showDetails();
        emp2.showDetails();
        emp3.showDetails();

    }

    /*Employee(String name,int yearOfJoining,double salary,String address){
        this.name = name;
        this.yearOfJoining = yearOfJoining;
        this.salary = salary;
        this.address = address;
    }*/

}
