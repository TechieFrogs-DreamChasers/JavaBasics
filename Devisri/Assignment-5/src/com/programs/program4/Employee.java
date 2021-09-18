package com.programs.program4;

public class Employee extends Person{
    @Override
    public void a_Method() {
        System.out.println("This is abstract method implementation in Sub class Employee");
    }
    public static void main(String[] args) {
        Employee emp=new Employee();
        emp.a_Method();
        emp.display();
    }
}
