package com.newPractice.collections.ALcodingQ.q4;

public class Employee {
    private Integer emp_Id;
    private String emp_Name;
    private Integer emp_Age;
    private Double emp_Salary;

    public Employee(Integer emp_Id, String emp_Name, Integer emp_Age, Double emp_Salary) {
        this.emp_Id = emp_Id;
        this.emp_Name = emp_Name;
        this.emp_Age = emp_Age;
        this.emp_Salary = emp_Salary;
    }

    public Integer getEmp_Id() {
        return emp_Id;
    }

    public void setEmp_Id(Integer emp_Id) {
        this.emp_Id = emp_Id;
    }

    public String getEmp_Name() {
        return emp_Name;
    }

    public void setEmp_Name(String emp_Name) {
        this.emp_Name = emp_Name;
    }

    public Integer getEmp_Age() {
        return emp_Age;
    }

    public void setEmp_Age(Integer emp_Age) {
        this.emp_Age = emp_Age;
    }

    public Double getEmp_Salary() {
        return emp_Salary;
    }

    public void setEmp_Salary(Double emp_Salary) {
        this.emp_Salary = emp_Salary;
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
}
