package com.newPractice.java8.streams;

import java.util.Objects;

public class Employee {
    private Long emp_Id;
    private String emp_Name;
    private Integer emp_Age;
    private Integer emp_Salary;

    public Employee() {
    }

    public Employee(Long emp_Id, String emp_Name, Integer emp_Age, Integer emp_Salary) {
        this.emp_Id = emp_Id;
        this.emp_Name = emp_Name;
        this.emp_Age = emp_Age;
        this.emp_Salary = emp_Salary;
    }

    public Long getEmp_Id() {
        return emp_Id;
    }

    public String getEmp_Name() {
        return emp_Name;
    }

    public Integer getEmp_Age() {
        return emp_Age;
    }

    public Integer getEmp_Salary() {
        return emp_Salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "emp_Id=" + emp_Id +
                ", emp_Name='" + emp_Name + '\'' +
                ", emp_Age=" + emp_Age +
                ", emp_Salary=" + emp_Salary +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return emp_Id.equals(employee.emp_Id) && emp_Name.equals(employee.emp_Name) && emp_Age.equals(employee.emp_Age) && emp_Salary.equals(employee.emp_Salary);
    }

    @Override
    public int hashCode() {
        return Objects.hash(emp_Id, emp_Name, emp_Age, emp_Salary);
    }
}
