package Assignment2;

import java.util.Scanner;

public class Employees {
    String name;
    int year;
    String address;
    void getData(Scanner sc){
        
        System.out.println("Enter Employees Name :");
        this.name = sc.next();
        System.out.println("Enter Joining Year :");
        this.year = sc.nextInt();
        System.out.println("Enter Employees Address :");
        this.address = sc.next();
    
    }
    void display(){
       
        System.out.println(name+"          "+year+"     "+address);
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Employees e1 = new Employees();
        e1.getData(sc);
        Employees e2 = new Employees();
        e2.getData(sc);
        Employees e3 = new Employees();
        e3.getData(sc);
        System.out.println("Name          Joining Year     Address");
        e1.display();
        e2.display();
        e3.display();
        sc.close();
    }
}
