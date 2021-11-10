package com.obj.practice;
//Has-A relationship depiction
public class EmpAdrFunctionality {
    public static void main(String[] args) {
        Address address=new Address(250,"Bangalore","KA","India",101010);
        Employee emp=new Employee(101,"John",9521470369L,"john@email.com",address);
        System.out.println(emp);
        Address address2=new Address(50,"Hyderabad","TA","India",105010);
        Employee emp2=new Employee(102,"Samuel",9521472569L,"samuel@email.com",address2);
        System.out.println(emp2);
        Address address3=new Address(150,"Bangalore","KA","India",101010);
        Employee emp3=new Employee(103,"Meghan",9521478526L,"meghan@email.com",address3);
        System.out.println(emp3);
    }
}
/*
Employee{emp_Id=101, emp_Name='John', emp_Phone=9521470369, emp_Email='john@email.com',
 address=Address{h_No=250, city='Bangalore', state='KA', country='India', zipCode=101010}}
Employee{emp_Id=102, emp_Name='Samuel', emp_Phone=9521472569, emp_Email='samuel@email.com',
address=Address{h_No=50, city='Hyderabad', state='TA', country='India', zipCode=105010}}
Employee{emp_Id=103, emp_Name='Meghan', emp_Phone=9521478526, emp_Email='meghan@email.com',
address=Address{h_No=150, city='Bangalore', state='KA', country='India', zipCode=101010}}
*/