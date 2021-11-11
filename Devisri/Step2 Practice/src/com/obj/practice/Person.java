package com.obj.practice;

public class Person {
    private String name;
    private int age;
    private String email;
    private long phone;
    Address address;

    public Person(String name, int age, String email, long phone, Address address) {
        this.name = name;
        this.age = age;
        this.email = email;
        this.phone = phone;
        this.address = address;
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

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }
    @Override
    public String toString() {
        return getName()+"\t"+getAge()+"\t"+getEmail()+"\t"+
                getPhone()+"\n"+getAddress();
    }
}
