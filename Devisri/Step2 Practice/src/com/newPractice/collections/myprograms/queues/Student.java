package com.newPractice.collections.myprograms.queues;

public class Student {
    private Integer id;
    private String name;
    private Integer age;
    private String grade;

    public Student(Integer id, String name, Integer age, String grade) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.grade = grade;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", grade='" + grade + '\'' +
                '}';
    }
}
