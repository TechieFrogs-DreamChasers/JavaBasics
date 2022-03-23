package com.java8.practice.stream;

public class Employee {
    private int emp_Id;
    private String emp_Name;
    private String emp_Status;
    private double emp_Salary;
    private int emp_Dep_Id;

    public Employee(int emp_Id, String emp_Name, String emp_Status, double emp_Salary, int emp_Dep_Id) {
        this.emp_Id = emp_Id;
        this.emp_Name = emp_Name;
        this.emp_Status = emp_Status;
        this.emp_Salary = emp_Salary;
        this.emp_Dep_Id = emp_Dep_Id;
    }

    public int getEmp_Id() {
        return emp_Id;
    }

    public void setEmp_Id(int emp_Id) {
        this.emp_Id = emp_Id;
    }

    public String getEmp_Name() {
        return emp_Name;
    }

    public void setEmp_Name(String emp_Name) {
        this.emp_Name = emp_Name;
    }

    public String getEmp_Status() {
        return emp_Status;
    }

    public void setEmp_Status(String emp_Status) {
        this.emp_Status = emp_Status;
    }

    public double getEmp_Salary() {
        return emp_Salary;
    }

    public void setEmp_Salary(double emp_Salary) {
        this.emp_Salary = emp_Salary;
    }

    public int getEmp_Dep_Id() {
        return emp_Dep_Id;
    }

    public void setEmp_Dep_Id(int emp_Dep_Id) {
        this.emp_Dep_Id = emp_Dep_Id;
    }

    @Override
    public String toString() {
        return "Employee[ Id: "+getEmp_Id()+"\t"+
                "Name: "+getEmp_Name()+"\t"+
                "Status: "+getEmp_Status()+"\t"+
                "Department Id: "+getEmp_Dep_Id()+"\t"+
                "Salary: "+getEmp_Salary()+" ]";
    }
}
