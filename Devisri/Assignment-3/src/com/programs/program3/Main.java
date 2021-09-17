package com.programs.program3;

public class Main {
    public static void main(String[] args) {
        Employee emp = new Employee("John", 31, 98524731L, "India", 50000.0, "Developer", "Java");
        emp.printSalary();
        System.out.println("*****************************");
        Manager manager = new Manager("Meghan", 36, 8521456L, "India", 90000.0, "Assistant", "Head");
        manager.printSalary();
    }
}
