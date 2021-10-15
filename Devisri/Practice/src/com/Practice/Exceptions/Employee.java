package com.Practice.Exceptions;

public class Employee extends Exception {
    static int[] id = {1001, 1002, 1003, 1004, 1005};
    static String[] name = {"John", "Sam", "Anne", "Bob", "Tom"};
    static double[] salary = {10000.0D, 25000.0D, 5000.0D, 30000.0D, 45000.0D};

    Employee(String message) {
        super(message);
    }

    public static void main(String[] args) {
        try {
            System.out.println("Id: " + "\t" + "Name: " + "\t \t" + "Salary: ");
            for (int i = 0; i < id.length; i++) {
                System.out.println(id[i] + "\t" + name[i] + "\t \t" + salary[i]);
                if (salary[i] < 10000) {
                    throw new Employee("SALARY IS LESS THAN 10000");
                }
            }
        } catch (Employee employee) {
            //employee.printStackTrace();
            System.err.println("SALARY < 10000.0");
        }
    }
}
/*
Id: 	Name: 	Salary:
1001	John	10000.0
1002	Sam	25000.0
1003	Anne	5000.0
SALARY < 10000.0
 */