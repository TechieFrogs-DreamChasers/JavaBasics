package com.newPractice.java8.streams;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class EmployeeDriver {
    public static void main(String[] args) {
        List<Employee> employees = EmployeeObject.getEmployeesDetails();
        System.out.println("Applying filter method: ");
        employees.stream().filter(e->e.getEmp_Age() >= 40).forEach(System.out::println);
        System.out.println();
        System.out.println("Applying distinct method: ");
        employees.stream().distinct().forEach(System.out::println);
        System.out.println();
        employees.stream().filter(e->e.getEmp_Salary()==30000).distinct().forEach(System.out::println);
        System.out.println();
        System.out.println("Applying limit method: ");
        employees.stream().filter(e->e.getEmp_Salary() > 45000).limit(2).forEach(System.out::println);
        System.out.println();
        System.out.println("Applying skip method: ");
        employees.stream().filter(e->e.getEmp_Salary() > 60000).skip(2).forEach(System.out::println);
        System.out.println();
        System.out.println("Applying peek method: ");
        employees.stream().filter(e->e.getEmp_Age()>=35).peek(System.out::println).limit(3).forEach(System.out::println);
        System.out.println();
        System.out.println("Applying map method: ");
        employees.stream().filter(e->e.getEmp_Age()>=35).map(e->e.getEmp_Name()).forEach(System.out::println);
        System.out.println();
        System.out.println("Applying flatMap method: ");
        employees.
                stream().
                filter(e->e.getEmp_Age()>=40).
                map(e->e.getEmp_Name().split(" ")).
                flatMap(a-> Arrays.stream(a)).
                collect(Collectors.toList()).
                forEach(System.out::println);
        System.out.println();
        System.out.println("Applying reduce(): ");
        Integer sum = employees.stream().map(e -> e.getEmp_Salary()).reduce(0, (a, b) -> a + b);
        System.out.println("Salary Sum: "+sum);
        employees.stream().reduce((a,b)->a.getEmp_Salary() < b.getEmp_Salary() ? b:a).ifPresent(e-> System.out.println("Max Salary: "+e));
        Employee employee = employees.stream().reduce((a, b) -> b).orElse(null);
        System.out.println("Last Employee: "+employee);
        System.out.println();
        System.out.println("Applying Collectors.toMap(): ");
        Map<Long, Employee> employeeMap = employees.stream().collect(Collectors.toMap(Employee::getEmp_Id, Function.identity()));
        System.out.println("Employee Map: "+employeeMap);
        System.out.println();
        System.out.println("Applying Collectors.groupingBy(): ");
        Map<String, List<Employee>> listMap = employees.stream().collect(Collectors.groupingBy(Employee::getEmp_Name));
        listMap.entrySet().forEach((e)-> System.out.println("Employee Name: "+e));
    }
}
