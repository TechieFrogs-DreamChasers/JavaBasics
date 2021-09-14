import java.util.Scanner;
public class Student{
    String name;
    static int rno;
    Student(String n, int i){
        this.name=n;
        Student.rno=i;

    }
    void display(){
        System.out.println(name + " " + rno);
        


    }

    public static void main(String[] args) {
     Student obj=new Student("john",7);
     obj.display();
     

     


    }
   

} 
