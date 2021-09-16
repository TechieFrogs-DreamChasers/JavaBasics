/*
3. Create a class named 'Member' having the following members:
Data members
1 - Name
2 - Age
3 - Phone number
4 - Address
5 - Salary
It also has a method named 'printSalary' which prints the salary of the members.
Two classes 'Employee' and 'Manager' inherits the 'Member' class. The 'Employee' and 'Manager' classes have data members 'specialization' and 'department' respectively. Now, assign name, age, phone number, address and salary to an employee and a manager
by making an object of both of these classes and print the same. */
package INHEITANCEASGN;

public class Member {
    String name;
    private int age;
    private String address;
    private String ph_no;
    private double salary;

    public void setName(String name){// public setters
        this.name = name;
    }
    public void setAge(int age){
        this.age = age;
    }

    public void setAddress(String address){
        this.address = address;
    }

    public void setph_no(String ph_no){
        this.ph_no = ph_no;
    }
    public void setSalary(double salary){
        this.salary = salary;
    }

    public String getName(){// public getters
        return name;
    }
    public int getAge(){
        return age;
    }
    public String getAddress(){
        return address;
    }
    public String getph_no(){
        return ph_no;
    }

    public double printSalary(){
        return salary;
    }
}
