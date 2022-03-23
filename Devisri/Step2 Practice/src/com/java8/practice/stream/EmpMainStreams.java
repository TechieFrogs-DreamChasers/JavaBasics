package com.java8.practice.stream;

import java.util.*;
import java.util.function.BinaryOperator;
import java.util.stream.Collectors;

public class EmpMainStreams {
    public static void main(String[] args) {
        List<Employee> emp_List=EmployeeObject.employeeList();
        for(Employee employee:emp_List)
            System.out.println(employee);
        //emp list based on department id using Streams
        System.out.println("emp list based on emp_id using Streams: ");
        Map<Integer,List<Employee>> emp_id_map = emp_List.stream().collect(Collectors.groupingBy(Employee::getEmp_Id,Collectors.toList()));
        System.out.println("Data retrieval using Emp Id: "+emp_id_map.entrySet());
        System.out.println("emp list based on emp_name using Streams: ");
        System.out.println(emp_List.stream().collect(Collectors.groupingBy(Employee::getEmp_Name)));
        System.out.println("emp list based on department id using Streams: ");
        System.out.println(emp_List.stream().collect(Collectors.groupingBy(Employee::getEmp_Dep_Id)));
        System.out.println("emp list based on emp_status using Streams: ");
        System.out.println(emp_List.stream().collect(Collectors.groupingBy(Employee::getEmp_Status)));
        System.out.println("emp list based on emp_salary using Streams: ");
        System.out.println(emp_List.stream().collect(Collectors.groupingBy(Employee::getEmp_Salary)));

        Map<Integer,Long> map = emp_List.stream().collect(Collectors.groupingBy(Employee::getEmp_Dep_Id,Collectors.counting()));
        System.out.println("Counting Number of employees in each department using Collectors.count(): ");
        for(Map.Entry<Integer,Long> pair:map.entrySet()){
            System.out.println(pair.getKey()+" = "+ pair.getValue());
        }
       Map<String,Long> status_Map =emp_List.stream().collect(Collectors.groupingBy(Employee::getEmp_Status,Collectors.counting()));
        System.out.println("Counting employee status using Collectors.count(): ");
        for(Map.Entry<String,Long> pair:status_Map.entrySet()){
            System.out.println(pair.getKey()+" = "+ pair.getValue());
        }
        System.out.println("Another Way using filter(): ");
        long per_Count = emp_List.stream().filter(e->"Permanent".equals(e.getEmp_Status())).count();
        long temp_Count = emp_List.stream().filter(e->"Temporary".equals(e.getEmp_Status())).count();
        System.out.println("Permanent Employees: "+per_Count+"\t Temporary Employees: "+temp_Count);
        System.out.println("Printing Max and Min Salary on employees using Max,Min()'s: ");
        Optional<Employee> sal_Max = emp_List.stream().max(Comparator.comparing(Employee::getEmp_Salary));
        Optional<Employee> sal_Min = emp_List.stream().min(Comparator.comparing(Employee::getEmp_Salary));
        System.out.println("Max Salary: "+sal_Max+"\t Min Salary: "+sal_Min);
        System.out.println("Printing top salary in each department: ");
        Map<Integer,Optional<Employee>> emp_top_Sal = emp_List.stream().collect(Collectors.groupingBy(Employee::getEmp_Dep_Id,
                Collectors.reducing(BinaryOperator.maxBy(Comparator.comparing(Employee::getEmp_Salary)))));
        System.out.println(emp_top_Sal);
    }
}
