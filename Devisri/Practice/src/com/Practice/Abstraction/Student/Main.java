package com.Practice.Abstraction.Student;
/*
Output:
School Name: Virtual Tech
Roll|Name|Marks|Grade
1    Meg    350    B
2    Tom    590    A
3    Bob    290    C
4    Ann    450    B
5    Tim    550    A
6    Jim    480    B
7    Tim    510    A
8    Ian    570    A
9    Cal    299    C
10    Eve    390    B

6    Jim    480    B
C
 */
public class Main {
    public static void main(String[] args) {
        StudentDetails sd = new StudentDetails();
        int[] roll = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        String[] name = new String[]{"Meg", "Tom", "Bob", "Ann", "Tim", "Jim", "Tim", "Ian", "Cal", "Eve"};
        int[] marks = new int[]{350, 590, 290, 450, 550, 480, 510, 570, 299, 390};
        sd.details();
        /* for (int i=0;i<marks.length;i++){
            sd.show_Grade(marks[i]);
        }*/
        for (int i = 0; i < name.length; i++) {
            sd.show_Student_Data(roll[i], name[i], marks[i], sd.show_Grade(marks[i]));
        }
        System.out.println("  ");
        Student std = new StudentDetails();
        std.show_Student_Data(roll[5], name[5], marks[5], sd.show_Grade(marks[5]));
        System.out.println(std.show_Grade(marks[2]));
    }
}
