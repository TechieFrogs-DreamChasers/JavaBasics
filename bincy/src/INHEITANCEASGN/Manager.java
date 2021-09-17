package INHEITANCEASGN;

import java.util.Scanner;

public class Manager extends Member{
    String dep;
    public static void main(String[] args){
        Manager manager = new Manager();
        Scanner obj =new Scanner(System.in);
        System.out.println("Enter Manager details: ");
        System.out.println("Enter Name : ");
        String name = obj.nextLine();
        System.out.println("Enter age : ");
        int age = obj.nextInt();
        obj.nextLine();
        System.out.println("Enter address: ");
        String address = obj.nextLine();
        System.out.println("Enter ph_no");
        String ph_no = obj.nextLine();
        System.out.println("Enter salary: ");
        Double salary = obj.nextDouble();
        System.out.println("Enter Department: ");
        manager.dep = obj.next();
        obj.close();
        
        manager.setName(name);
        manager.setAge(age);
        manager.setAddress(address);
        manager.setph_no(ph_no);
        manager.setSalary(salary);
        
        System.out.println(manager.getName()+ " "+manager.getAge()+ " "+ manager.getAddress()+" "+manager.getph_no()+ " "+manager.dep);
    }    
}
