package com.Practice;

import com.Practice.Encapsulation.Person;

//import com.Practice.InnerClasses.Person;
public class Main {
    public static void main(String[] args) {
        Person person = new Person();
        person.id = 6897;
        person.setAge(29);
        person.setName("Glenn");
        person.setEmail("glenn@email.com");
        person.setPhone(9874561203L);
        person.setSalary(50000.0);
        System.out.println(person.id + "  " + person.getName() + "  " + person.getAge() + "  " + person.getSalary() + "  "
                + person.getEmail() + "  " + person.getPhone());
        System.out.println("*************************");
        /*com.Practice.InnerClasses.Person p=new com.Practice.InnerClasses.Person();
         the above line can get access here. But Person() is private in that package Person class.
         so we can't get access to that constructor. Now i will create parameter constructor in that class.
        */
        com.Practice.InnerClasses.Person p = new com.Practice.InnerClasses.Person("Ben", 5879460123L);
        /*output will only display the given values in this constructor
         other details in this InnerClass Person are set to private.
         so we get default values as output.*/
        p.out_display();
        System.out.println("******************************");
        Person person2 = new Person("Tom", 8521, 40, 80000.0, "tom@email.com", 3012658947L);
        //displays above details...
        System.out.println(person2.id + "  " + person2.getName() + "  " + person2.getAge() + "  " + person2.getSalary() + "  "
                + person2.getEmail() + "  " + person2.getPhone());
    }
}
