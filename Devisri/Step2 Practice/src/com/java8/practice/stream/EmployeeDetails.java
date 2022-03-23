package com.java8.practice.stream;

public class EmployeeDetails {
    private int emp_Id;
    private String emp_Name;
    private String emp_Status;
    private double emp_Salary;
    private int emp_Age;
    private char emp_Gender;
    private String emp_Dep;
    private int emp_join_Year;

    public EmployeeDetails(int emp_Id, String emp_Name, String emp_Status, double emp_Salary, int emp_Age, char emp_Gender, String emp_Dep, int emp_join_Year) {
        this.emp_Id = emp_Id;
        this.emp_Name = emp_Name;
        this.emp_Status = emp_Status;
        this.emp_Salary = emp_Salary;
        this.emp_Age = emp_Age;
        this.emp_Gender = emp_Gender;
        this.emp_Dep = emp_Dep;
        this.emp_join_Year = emp_join_Year;
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

    public int getEmp_Age() {
        return emp_Age;
    }

    public void setEmp_Age(int emp_Age) {
        this.emp_Age = emp_Age;
    }

    public char getEmp_Gender() {
        return emp_Gender;
    }

    public void setEmp_Gender(char emp_Gender) {
        this.emp_Gender = emp_Gender;
    }

    public String getEmp_Dep() {
        return emp_Dep;
    }

    public void setEmp_Dep(String emp_Dep) {
        this.emp_Dep = emp_Dep;
    }

    public int getEmp_join_Year() {
        return emp_join_Year;
    }

    public void setEmp_join_Year(int emp_join_Year) {
        this.emp_join_Year = emp_join_Year;
    }

    @Override
    public String toString() {
        return "EmployeeDetails{" +
                "emp_Id=" + emp_Id +
                ", emp_Name='" + emp_Name + '\'' +
                ", emp_Status='" + emp_Status + '\'' +
                ", emp_Salary=" + emp_Salary +
                ", emp_Age=" + emp_Age +
                ", emp_Gender=" + emp_Gender +
                ", emp_Dep='" + emp_Dep + '\'' +
                ", emp_join_Year=" + emp_join_Year +
                '}';
    }
}
