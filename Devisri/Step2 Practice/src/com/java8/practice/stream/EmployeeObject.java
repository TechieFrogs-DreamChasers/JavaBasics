package com.java8.practice.stream;

import java.util.ArrayList;
import java.util.List;

public class EmployeeObject {
    public static List<Employee> employeeList(){
        List<Employee> emp_List=new ArrayList<>();
        emp_List.add(new Employee(10001,"Samuel","Permanent",100000.5,105));
        emp_List.add(new Employee(10002,"Meghan","Permanent",110000.5,104));
        emp_List.add(new Employee(10003,"Frank","Temporary",25000.5,101));
        emp_List.add(new Employee(10004,"Anna","Permanent",80000.5,102));
        emp_List.add(new Employee(10005,"Bradley","Temporary",25000.5,103));
        emp_List.add(new Employee(10006,"Phebe","Temporary",30000.5,105));
        emp_List.add(new Employee(10007,"Lisa","Permanent",90000.5,105));
        emp_List.add(new Employee(10008,"Eleanor","Permanent",20000.5,105));
        emp_List.add(new Employee(10009,"Thomas","Temporary",10000.5,101));
        emp_List.add(new Employee(10010,"Greene","Permanent",120000.5,104));
        return emp_List;
    }
}
