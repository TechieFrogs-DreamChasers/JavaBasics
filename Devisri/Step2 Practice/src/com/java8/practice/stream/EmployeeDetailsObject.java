package com.java8.practice.stream;

import java.util.ArrayList;
import java.util.List;

public class EmployeeDetailsObject {
    public static List<EmployeeDetails> employeeDetails(){
        List<EmployeeDetails> empList = new ArrayList<>();
        empList.add(new EmployeeDetails(1001,"John","Permanent",150000,42,'M',"Team-Lead",2012));
        empList.add(new EmployeeDetails(1002,"Samuel","Permanent",110000,36,'M',"Senior Developer",2016));
        empList.add(new EmployeeDetails(1003,"Frank","Permanent",90000,32,'M',"Developer",2018));
        empList.add(new EmployeeDetails(1004,"Ella","Temporary",60000,29,'F',"Junior Developer",2020));
        empList.add(new EmployeeDetails(1005,"Thomas","Temporary",60000,28,'M',"Junior Developer",2019));
        empList.add(new EmployeeDetails(2001,"Brad","Temporary",60000,29,'M',"Junior Developer",2019));
        empList.add(new EmployeeDetails(2002,"Meghan","Permanent",90000,30,'F',"Developer",2016));
        empList.add(new EmployeeDetails(2003,"Shane","Temporary",60000,31,'M',"Junior Developer",2020));
        empList.add(new EmployeeDetails(2004,"Paula","Permanent",110000,39,'F',"Senior Developer",2015));
        empList.add(new EmployeeDetails(2005,"Rachel","Permanent",150000,40,'F',"Team-Lead",2011));
        return empList;
    }
}
