//Handle ArithmeticException
public class Program13 {
    public static void main(String[] args) {
        String[] student_Name = {"Annie", "Bobby", "Chloe", "Devon", "Ellie"};
        int[] student_Marks = {500, 600, 300, 294, 450};
        try {
            System.out.println("Name: " + "\t" + "Marks: ");
            for (int i = 0; i < 5; i++) {
                System.out.println(student_Name[i] + "\t" + student_Marks[i]);
                if (student_Marks[i] < 300) {
                    throw new ResultException("Student Failed!!!");
                }
            }
        } catch (ResultException e) {
            System.out.println(e.getMessage());
        }
        try {
            System.out.println("Name: " + "\t" + "Marks: ");
            for (int i = 0; i < 5; i++) {
                System.out.println(student_Name[i] + "\t" + student_Marks[i]);
                if (student_Marks[i] <= 300) {
                    throw new ResultException("Student Barely Failed!!!");
                }
            }
        } catch (ResultException e) {
            System.out.println(e.getMessage());
        }
    }
}

class ResultException extends ArithmeticException {
    public ResultException(String s) {
        super(s);
    }
}
/*
Name: 	Marks:
Annie	500
Bobby	600
Chloe	300
Devon	294
Student Failed!!!
Name: 	Marks:
Annie	500
Bobby	600
Chloe	300
Student Barely Failed!!!
 */