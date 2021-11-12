package com.singleton.breaking;

public class EmployeeMain {
    public static void main(String[] args) throws CloneNotSupportedException {
        Employee emp_One=EmployeeUtility.createInstance();
        Employee emp_Two=EmployeeUtility.createInstance();

        emp_One.setEmp_Id(101);
        emp_One.setEmp_Name("John");
        emp_One.setSalary(50000.0);
        emp_One.setEmployment_Type("Permanent");

        emp_Two.setEmp_Id(105);
        emp_Two.setEmp_Name("Bob");
        emp_Two.setSalary(15000.0);
        emp_Two.setEmployment_Type("Temporary");

        System.out.println(emp_One.hashCode()==emp_Two.hashCode());
        System.out.println(emp_One);
        System.out.println(emp_Two);
        /*
        achieving Singleton before clone process
        true
        Bob	105	15000.0	Temporary
        Bob	105	15000.0	Temporary
        */
        //Using clone()
        Employee emp_Three = (Employee) emp_One.clone();
        System.out.println(emp_One.hashCode()==emp_Three.hashCode());
        System.out.println(emp_One);
        System.out.println(emp_Three);
        /*
        true
        Bob	105	15000.0	Temporary
        Bob	105	15000.0	Temporary
        false
        Bob	105	15000.0	Temporary
        Bob	105	15000.0	Temporary
         */
    }
}
