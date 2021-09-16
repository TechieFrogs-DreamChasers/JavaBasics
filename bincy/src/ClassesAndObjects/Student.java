package ClassesAndObjects;

public class Student {
    String name;
    int roll_no;
    String ph_no;
    String address;
    public static void main(String[] args){
        Student student1 = new Student();
        student1.name = "John";
        student1.roll_no = 2;
        student1.ph_no = "757-345-2345";
        student1.address = "2345,Atlantic";
        Student student2 = new Student();
        student2.name = "Sam";
        student2.roll_no = 3;
        student2.ph_no = "757-456-3445";
        student2.address ="2456,Princess";
        student1.display();
        student2.display();

    }
    void display(){
        System.out.println(name+"  " + roll_no + "  "+ ph_no +"  "+address);
    }
}
