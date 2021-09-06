public class StudentTwoObjects {
    String name;
    int roll_No;

    public StudentTwoObjects(String name, int roll_No) {
        this.name = name;
        this.roll_No = roll_No;
    }

    public static void main(String[] args) {
        StudentTwoObjects student=new StudentTwoObjects("John",1);
        student.details();
        StudentTwoObjects student2=new StudentTwoObjects("Sam", 2);
        student2.details();
    }
    void details(){
        System.out.println(name+" "+roll_No);
    }
}
