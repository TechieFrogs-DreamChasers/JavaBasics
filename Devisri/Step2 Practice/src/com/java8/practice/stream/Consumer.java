package com.java8.practice.stream;

import java.util.List;

public class Consumer {
    private String name;
    private List<String> phone;

    public Consumer(String name, List<String> phone) {
        this.name = name;
        this.phone = phone;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<String> getPhone() {
        return phone;
    }

    public void setPhone(List<String> phone) {
        this.phone = phone;
    }

    @Override
    public String toString() {
        return "Consumer{" +
                "name='" + name + '\'' +
                ", phone=" + phone +
                '}';
    }
}
