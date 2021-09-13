package com.Practice.Encapsulation;

public class Person {
    private String name;
    public int id;
    private int age;
    private double salary;
    private String email;
    private long phone;

    public Person() {
    }

    public Person(String name, int id, int age, double salary, String email, long phone) {
        System.out.println("Person class-->Person(Parameters)");
        this.name = name;
        this.id = id;
        this.age = age;
        this.salary = salary;
        this.email = email;
        this.phone = phone;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public long getPhone() {
        return phone;
    }

    public void setPhone(long phone) {
        this.phone = phone;
    }

    void display(int id, String name, int age, String email, long phone, double salary) {
        System.out.println(id + "  " + name + "  " + age + "  " + email + "  " + phone + "  " + salary);
    }

    public static void main(String[] args) {
        Person person = new Person();
        person.display(5621, "Sam", 30, "sam@email.com", 8521036479L, 90000);
    }
}
