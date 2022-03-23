package com.newPractice.collections.myprograms.queues;

import java.util.LinkedList;
import java.util.Queue;

public class Driver {
    public static void main(String[] args) {
        Queue<Student> students = new LinkedList<>();
        students.offer(new Student(101,"John",16,"A+"));
        students.offer(new Student(102,"Shaun",17,"A"));
        students.offer(new Student(103,"Anne",15,"B"));
        students.offer(new Student(104,"Meghan",18,"B+"));
        students.offer(new Student(105,"Grace",14,"A"));
        students.offer(new Student(106,"Phillip",12,"C"));
        System.out.println(students);
    }
}
