package com.newPractice.java8.streams;

import java.util.ArrayList;
import java.util.List;

public class EmployeeObject {
    public static List<Employee> getEmployeesDetails(){
        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee(10001l,"John Avery",41,69000));
        employees.add(new Employee(10002l,"Grace Cho",36,35000));
        employees.add(new Employee(10003l,"Meghan Fanning",49,90000));
        employees.add(new Employee(10004l,"Lionel King",30,30000));
        employees.add(new Employee(10005l,"Karen Shaw",29,30000));
        employees.add(new Employee(10006l,"Tom Jennings",38,35000));
        employees.add(new Employee(10007l,"Stuart Broad",35,33000));
        employees.add(new Employee(10008l,"Quinn Parker",28,30000));
        employees.add(new Employee(10009l,"Veronica Park",45,65000));
        employees.add(new Employee(100010l,"Anna Thompson",32,31000));
        return employees;
    }
}
