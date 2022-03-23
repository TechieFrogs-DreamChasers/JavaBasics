package com.java8.practice.stream;

import java.util.*;
import java.util.stream.Collectors;

public class EmployeeDetailsMain {
    public static void main(String[] args) {
        List<EmployeeDetails> emp_details = EmployeeDetailsObject.employeeDetails();
        //Count employees based on Gender using Stream
        System.out.println("Count employees based on Gender using Stream(Way-1): ");
        long male_count = emp_details.stream().map(EmployeeDetails::getEmp_Gender).filter(e->String.valueOf(e).equals(String.valueOf('M'))).count();
        long female_count = emp_details.stream().map(EmployeeDetails::getEmp_Gender).filter(e->String.valueOf(e).equals(String.valueOf('F'))).count();
        System.out.println("Number of Male Employees: "+male_count);
        System.out.println("Number of Female Employees: "+female_count);
        System.out.println("Count employees based on Gender using Stream(Way-2): ");
        Map<Character,Long> count_emp_gen =emp_details.stream().collect(Collectors.groupingBy(EmployeeDetails::getEmp_Gender,Collectors.counting()));
        for(Map.Entry<Character,Long> pair:count_emp_gen.entrySet())
            System.out.println(pair.getKey()+" - "+pair.getValue());
        System.out.println(" ");
        //Print names of all designations using Stream
        System.out.println("Print names of all designations using Stream: ");
        emp_details.stream().map(EmployeeDetails::getEmp_Dep).distinct().forEach(System.out::println);
        System.out.println();
        //Average age of male and female employees
        System.out.println("Average age of male and female employees using Stream:");
        Map<Character,Double> age_Avg = emp_details.stream().collect(Collectors.groupingBy(EmployeeDetails::getEmp_Gender,Collectors.averagingInt(EmployeeDetails::getEmp_Age)));
        System.out.println("Average Age: "+age_Avg);
        System.out.println();
        //Get Details of Highest Paid Employee
        System.out.println("Get Details of Highest Paid Employee using Stream(Way-1): ");
        EmployeeDetails emp = emp_details.stream().max(Comparator.comparing(EmployeeDetails::getEmp_Salary)).get();
        System.out.println("Highest Salary: "+emp.getEmp_Name());
        System.out.println("Get Details of Highest Paid Employee using Stream(Way-2): ");
        EmployeeDetails e=emp_details.stream().collect(Collectors.maxBy(Comparator.comparingDouble(EmployeeDetails::getEmp_Salary))).get();
        System.out.println("Highest Salary: "+e);
        System.out.println();
        //Get Names of all employees joined after 2015
        System.out.println("Get Names of all employees joined after 2015 using Stream:");
        emp_details.stream().filter(x->x.getEmp_join_Year() > 2016).map(EmployeeDetails::getEmp_Name).forEach(System.out::println);
        //Count Number of employees in each department
        System.out.println();
        System.out.println("Count Number of employees in each department");
        Map<String, Long> emp_Count = emp_details.stream().collect(Collectors.groupingBy(EmployeeDetails::getEmp_Dep, Collectors.counting()));
        System.out.println("Emp Count: "+emp_Count);
        System.out.println();
        //Average salary of each department
        System.out.println("Average salary of each department using streams: ");
        Map<String, Double> emp_Avg_Sal = emp_details.stream().collect(Collectors.groupingBy(EmployeeDetails::getEmp_Dep, Collectors.averagingDouble(EmployeeDetails::getEmp_Salary)));
        System.out.println("Average Salary Dep-wise: "+emp_Avg_Sal);
        System.out.println();
        //Get the details of the youngest Employee
        System.out.println("Get the details of the youngest Employee using Streams: ");
        EmployeeDetails younger_Emp = emp_details.stream().min(Comparator.comparing(EmployeeDetails::getEmp_Age)).get();
        System.out.println("Younger Employee: "+younger_Emp.getEmp_Name()+"\t"+younger_Emp.getEmp_Age());
        System.out.println();
        //Get the details of most working experience employee
        System.out.println("Get the details of most working experience employee using Streams: ");
        EmployeeDetails emp_exp = emp_details.stream().max(Comparator.comparing(EmployeeDetails::getEmp_join_Year)).get();
        System.out.println("Experienced Employee: "+emp_exp.getEmp_Name());
        System.out.println();
        //How many Male & Female Employees are there department-wise?
        Map<Character, Long> developers = emp_details.stream().filter(x -> x.getEmp_Dep().equals("Developer")).collect(Collectors.groupingBy(EmployeeDetails::getEmp_Gender, Collectors.counting()));
        System.out.println("Number of emp: "+developers);
        System.out.println(" ");
        //Average salary of male & female employees
        Map<Character, Double> gender_Avg_Sal = emp_details.stream().collect(Collectors.groupingBy(EmployeeDetails::getEmp_Gender, Collectors.averagingDouble(EmployeeDetails::getEmp_Salary)));
        System.out.println("Average Salary: "+gender_Avg_Sal);
        //List down all employee names in each department
        System.out.println("List down all employee names in each department: ");
        Map<String, List<EmployeeDetails>> collect = emp_details.stream().collect(Collectors.groupingBy(EmployeeDetails::getEmp_Dep));
        for(Map.Entry<String,List<EmployeeDetails>> pair: collect.entrySet())
        {
            System.out.println("-------------------------------------------");
            System.out.println(pair.getKey()+" : ");
            System.out.println("-------------------------------------------");
            List<EmployeeDetails> names = pair.getValue();
            for(EmployeeDetails employee:names)
                System.out.println(employee.getEmp_Name());
        }
        System.out.println();
        //What is the average salary and total salary
        System.out.println("Average salary and total salary: ");
        DoubleSummaryStatistics summary = emp_details.stream().collect(Collectors.summarizingDouble(EmployeeDetails::getEmp_Salary));
        System.out.println("Average Salary: "+summary.getAverage());
        System.out.println("Total Salary: "+summary.getSum());
        System.out.println();
        //Separate employees based on age <30 and >30
        System.out.println("Separate employees based on age <30 and >30: ");
        Map<Boolean, List<EmployeeDetails>> age_partitions = emp_details.stream().collect(Collectors.partitioningBy(x -> x.getEmp_Age() > 30));
        System.out.println("Ages: "+age_partitions);
        System.out.println();
        //Oldest Employee and his designation and the age
        System.out.println("Oldest Employee and his designation and the age: ");
        EmployeeDetails employeeDetails = emp_details.stream().max(Comparator.comparing(EmployeeDetails::getEmp_Age)).get();
        System.out.println("Oldest Employee: "+employeeDetails);
    }
}
