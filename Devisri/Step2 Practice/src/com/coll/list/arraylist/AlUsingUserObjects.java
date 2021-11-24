package com.coll.list.arraylist;

import java.util.ArrayList;
import java.util.List;

public class AlUsingUserObjects {
    public static void main(String[] args) {
        List<Employee> employeeList=new ArrayList<>();
        employeeList.add(new Employee(101,"Ann",30,50000));
        employeeList.add(new Employee(102,"Sam",32,60000));
        employeeList.add(new Employee(103,"Bob",34,70000));
        employeeList.add(new Employee(104,"Tom",36,80000));
        employeeList.add(new Employee(105,"Jim",38,90000));
        System.out.println(employeeList);
    }
}
