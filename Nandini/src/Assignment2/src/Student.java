
public class Student {
    String name;
    int roll_No;

    public Student(String name, int roll_No) {
        this.name = name;
        this.roll_No = roll_No;
    }

    public static void main(String[] args) {
        Student student=new Student("Manasvi",29);
        student.information();
    }
    
    void information(){
        System.out.println(name+" "+roll_No);
    }
}


