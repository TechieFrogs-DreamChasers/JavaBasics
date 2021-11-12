package com.singleton.preventing;

public class Person implements Cloneable{
    private String name;
    private int age;
    private long phone;
    private boolean isEmployed;

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

    public long getPhone() {
        return phone;
    }

    public void setPhone(long phone) {
        this.phone = phone;
    }

    public boolean isEmployed() {
        return isEmployed;
    }

    public void setEmployed(boolean employed) {
        isEmployed = employed;
    }

    @Override
    public String toString() {
        return getName()+"\t"+getAge()+"\t"+getPhone()+"\t"+isEmployed();
    }
    @Override
    public Object clone() throws CloneNotSupportedException {
        throw new CloneNotSupportedException("Singleton Pattern Prevention");
    }
}
