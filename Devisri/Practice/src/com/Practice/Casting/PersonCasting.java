package com.Practice.Casting;
class Teacher extends PersonCasting{
    String subject;

    public String toString(){
        return "Teacher Name: "+name+" Age: "+age+" Subject: "+subject;
    }

    public Teacher(String name, int age,String subject) {
        super(name, age);
        this.subject=subject;
    }
    void display(){
        System.out.println("This is display() of Teacher class!!!");
    }
    void show(){
        System.out.println("This is show() of Teacher class!!!");
    }
}
class Student extends PersonCasting{
    String course;
    public Student(String name, int age,String course) {
        super(name, age);
        this.course=course;
    }
    public String toString(){
        return "Student Name: "+name+" Age: "+age+" Course: "+course;
    }
    void display(){
        System.out.println("This is display() of Student class!!!");
    }
    void show(){
        System.out.println("This is show() of Student class!!!");
    }
}
public class PersonCasting {
    String name;
    int age;

    public PersonCasting(String name, int age) {
        this.name = name;
        this.age = age;
    }
    void display(){
        System.out.println("This is display() of Person class!!!");
    }

    public String toString(){
        return "Person Name: "+name+" Age: "+age;
    }
    public static void main(String[] args) {
        Student student=new Student("Anne",23,"Java");
        Teacher teacher=new Teacher("John",39,"Python");
        PersonCasting person=teacher;
        System.out.println(teacher);
        System.out.println(person);
        /*
        Teacher Name: John Age: 39 Subject: Python
        Teacher Name: John Age: 39 Subject: Python*/
        System.out.println(teacher.hashCode());//381259350
        System.out.println(person.hashCode());//381259350
        person.display();//This is display() of Teacher class!!!
        person=student;
        System.out.println(student);
        System.out.println(person);
        /*
        Student Name: Anne Age: 23 Course: Java
        Student Name: Anne Age: 23 Course: Java*/
        System.out.println(student.hashCode());//2129789493
        System.out.println(person.hashCode());//2129789493
        /*person.display();//This is display() of Student class!!!
         teacher.display();
         student.display();
         */
        teacher.show();//This is show() of Teacher class!!!
        student.show();//This is show() of Student class!!!
        System.out.println(" ");
        //displaySomething(person);
        displaySomething(teacher);
        /*
        This is display() of Teacher class!!!
        This is show() of Teacher class!!!
         */
        //displaySomething(student);
    }
    static void displaySomething(PersonCasting personCasting){
        personCasting.display();
        Teacher sam=(Teacher) personCasting;
        if(personCasting instanceof Teacher){
            sam.show();
        }
    }
}