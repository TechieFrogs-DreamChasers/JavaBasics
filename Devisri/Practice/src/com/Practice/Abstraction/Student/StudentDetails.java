package com.Practice.Abstraction.Student;

public class StudentDetails extends Student {
    @Override
    public char getGrade() {
        return show_Grade(getSubject_marks());
    }

    @Override
    public char show_Grade(int subject_marks) {
        if (subject_marks >= 500 & subject_marks <= 600)
            return 'A';
        else if (subject_marks > 300 & subject_marks < 500)
            return 'B';
        else
            return 'C';
    }
    @Override
    public void show_Student_Data(int roll_no, String name, int subject_marks, char grade) {
        System.out.println(roll_no + "    " + name + "    " + subject_marks + "    " + grade);
    }
    public void details(){
        System.out.println("School Name: "+Student.SCHOOL_NAME);
        System.out.println("Roll|Name|Marks|Grade");
    }
}
