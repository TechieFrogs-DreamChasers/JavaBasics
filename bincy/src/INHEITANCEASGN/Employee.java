package INHEITANCEASGN;

import java.util.Scanner;

public class Employee extends Member {
    String spec;
    public static void main(String[] args){
        Scanner obj =new Scanner(System.in);
        System.out.println("Enter Employee details: ");
        System.out.println("Enter Name : ");
        String name = obj.nextLine();
        System.out.println("Enter age : ");
        Employee emp = new Employee();
        int age = obj.nextInt();
        obj.nextLine();
        System.out.println("Enter address: ");
        String address = obj.nextLine();
        System.out.println("Enter ph_no");
        String ph_no = obj.nextLine();
        System.out.println("Enter salary: ");
        Double salary = obj.nextDouble();
        System.out.println("Enter specialisation: ");
        emp.spec = obj.next();
        obj.close();
        
        emp.setName(name);
        emp.setAge(age);
        emp.setAddress(address);
        emp.setph_no(ph_no);
        emp.setSalary(salary);
        
        System.out.println(emp.getName()+ " "+emp.getAge()+ " "+ emp.getAddress()+" "+emp.getph_no()+ " "+emp.spec);
    }    
    
    
}
