public class Student {
    String name;
    int roll_No;

    public Student(String name, int roll_No) {
        this.name = name;
        this.roll_No = roll_No;
    }

    public static void main(String[] args) {
        Student student=new Student("John",2);
        student.details();
    }
    void details(){
        System.out.println(name+" "+roll_No);
    }
}
