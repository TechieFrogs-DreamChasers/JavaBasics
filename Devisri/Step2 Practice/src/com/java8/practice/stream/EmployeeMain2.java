package com.java8.practice.stream;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class EmployeeMain2 {
    public static void main(String[] args) {
        List<Employee> employees = EmployeeObject.employeeList();
        //get maximum salary in employees list
        System.out.println("Get maximum salary in employees list: ");
        System.out.println("Max Salary: "+employees.stream().max(Comparator.comparing(Employee::getEmp_Salary)).get());
        System.out.println("Get minimum salary in employees list: ");
        Employee sal = employees.stream().min(Comparator.comparing(Employee::getEmp_Salary)).get();
        System.out.println("Min Salary: "+sal);
        //Sorting using salary in ascending order
        System.out.println("Sorting using salary in ascending order: ");
        List<Employee> emp_sal=employees.stream().sorted(Comparator.comparing(Employee::getEmp_Salary)).collect(Collectors.toList());
        for(Employee e:emp_sal)
            System.out.println(e);
        System.out.println("Sorting using Id in ascending order: ");
        List<Employee> emp_id=employees.stream().sorted(Comparator.comparing(Employee::getEmp_Id)).collect(Collectors.toList());
        for(Employee e:emp_id)
            System.out.println(e);
        System.out.println("Sorting using Name in ascending order: ");
        List<Employee> emp_name = employees.stream().sorted(Comparator.comparing(Employee::getEmp_Name)).collect(Collectors.toList());
        for(Employee e:emp_name)
            System.out.println(e);
        System.out.println("Sorting using department id in ascending order: ");
        List<Employee> emp_dep_id = employees.stream().sorted(Comparator.comparing(Employee::getEmp_Dep_Id)).collect(Collectors.toList());
        for(Employee e:emp_dep_id)
            System.out.println(e);
        //Sorting using salary in descending order
        System.out.println("Sorting using salary in descending order: ");
        List<Employee> emp_sal_desc=employees.stream().sorted(Collections.reverseOrder(Comparator.comparing(Employee::getEmp_Salary))).collect(Collectors.toList());
        for(Employee e:emp_sal)
            System.out.println(e);
        System.out.println("Sorting using Id in descending order: ");
        List<Employee> emp_id_desc=employees.stream().sorted(Collections.reverseOrder(Comparator.comparing(Employee::getEmp_Id))).collect(Collectors.toList());
        for(Employee e:emp_id)
            System.out.println(e);
        System.out.println("Sorting using Name in descending order: ");
        List<Employee> emp_name_desc = employees.stream().sorted(Collections.reverseOrder(Comparator.comparing(Employee::getEmp_Name))).collect(Collectors.toList());
        for(Employee e:emp_name)
            System.out.println(e);
        System.out.println("Sorting using department id in descending order: ");
        List<Employee> emp_dep_id_desc = employees.stream().sorted(Collections.reverseOrder(Comparator.comparing(Employee::getEmp_Dep_Id))).collect(Collectors.toList());
        for(Employee e:emp_dep_id)
            System.out.println(e);
        System.out.println("Iterating ArrayList User Class with Streams: ");
        employees.stream().forEach(System.out::println);
    }
}
