package Assignment6.Exercise4;

public class Main {
    public static void main(String[] args) {
        
        System.out.println("Interface Fields are static and final " + Subjects.mathMarks);
        System.out.println("Interface Fields are static and final " + Subjects.englishMarks);

        //System.out.println("Interface Fields are static and final " + (Subjects.englishMarks = 79));
        //we cannot reassign values to interface.

        System.out.println("            ");

        Student student = new Student();
        System.out.println("With Object of Student Class: "+ (student.englishMarks = 78));
        System.out.println("With Object of Student Class: "+ (student.mathMarks = 76));
     
    }
}
