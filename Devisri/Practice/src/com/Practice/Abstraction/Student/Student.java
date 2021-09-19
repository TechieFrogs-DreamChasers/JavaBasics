package com.Practice.Abstraction.Student;
/*
Show_student_data() is abstract method/constructor.
get_student_data() are non-abstract methods.
Total_marks=subject_1_marks
non-abstract Show_grade().
 */
public abstract class Student {
    private int roll_no;
    private String name;
    private int subject_marks;
    private char grade;
    static final String SCHOOL_NAME="Virtual Tech";

    public Student() {
        this.roll_no = 0;
        this.name = "name";
        this.subject_marks = 0;
        this.grade=' ';
    }

    public int getRoll_no() {
        return roll_no;
    }

    public char getGrade() {
        return grade;
    }

    public String getName() {
        return name;
    }

    public int getSubject_marks() {
        return subject_marks;
    }

    public abstract void show_Student_Data(int roll_no, String name, int subject_marks,char grade);

    public char show_Grade(int subject_marks){
        return ' ';
    }

}
