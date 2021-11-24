package com.coll.list.arraylist;

import java.util.ArrayList;
import java.util.Collections;

public class EmployeeMain {
    public static void main(String[] args) {
        ArrayList<Employee> employees=new ArrayList<>();
        employees.add(new Employee(105,"John",36,50000));
        employees.add(new Employee(101,"Sam",38,60000));
        employees.add(new Employee(104,"Bob",46,90000));
        employees.add(new Employee(102,"Greg",32,80000));
        employees.add(new Employee(103,"Noel",42,70000));

        Collections.sort(employees);
        System.out.println(employees);

    }
}
