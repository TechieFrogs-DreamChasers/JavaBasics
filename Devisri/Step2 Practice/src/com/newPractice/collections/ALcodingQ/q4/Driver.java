package com.newPractice.collections.ALcodingQ.q4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Driver {
    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee(101,"Amelia",36,50000.56));
        employees.add(new Employee(102,"Bradley",25,30000.56));
        employees.add(new Employee(103,"David",39,60000.56));
        employees.add(new Employee(104,"Emmaline",41,65000.56));
        employees.add(new Employee(105,"Christy",58,70000.56));
        employees.add(new Employee(106,"Annalise",21,20000.56));
        //Before sort list
        System.out.println("Employee List: "+employees);
        //Sort By Id
        Collections.sort(employees,new SortById());
        System.out.println("List sort by Id: "+employees);
        //Sort By Name
        Collections.sort(employees,new SortByName());
        System.out.println("List sort by Name: "+employees);
        //Sort By Age
        Collections.sort(employees,new SortByAge());
        System.out.println("List sort by Age: "+employees);
        //Sort By Salary
        Collections.sort(employees,new SortBySalary());
        System.out.println("List sort by Salary: "+employees);
    }
}
