package com.obj.practice;
//Dependent/Target class
public class Employee {
    int emp_Id;
    String emp_Name;
    long emp_Phone;
    String emp_Email;
    //Variable level independent class as datatype
    Address address;

    public Employee(int emp_Id, String emp_Name, long emp_Phone, String emp_Email, Address address) {
        this.emp_Id = emp_Id;
        this.emp_Name = emp_Name;
        this.emp_Phone = emp_Phone;
        this.emp_Email = emp_Email;
        this.address = address;
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

    public long getEmp_Phone() {
        return emp_Phone;
    }

    public void setEmp_Phone(long emp_Phone) {
        this.emp_Phone = emp_Phone;
    }

    public String getEmp_Email() {
        return emp_Email;
    }

    public void setEmp_Email(String emp_Email) {
        this.emp_Email = emp_Email;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "emp_Id=" + emp_Id +
                ", emp_Name='" + emp_Name + '\'' +
                ", emp_Phone=" + emp_Phone +
                ", emp_Email='" + emp_Email + '\'' +
                ", address=" + address +
                '}';
    }
}
