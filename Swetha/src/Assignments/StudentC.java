package Assignments;

public class StudentC {
    String name;
    int rollno;
    int Phno;
    String address;
    StudentC(String n,int rno,int ph,String addr)
    {
        name=n;
        rollno=rno;
        Phno=ph;
        address=addr;

    }

    public static void main(String[] args) {
        StudentC sobj=new StudentC("John",2,1235647892,"Hyderabad");
        StudentC sobj2=new StudentC("Sam",4,1234569872,"Banglore");
        System.out.println("Student1 details are: "+"Name: "+sobj.name+" "+"Roll NO: "+sobj.rollno+" "+"Phone No: "+sobj.Phno+" "+"Address: "+sobj.address);
        System.out.println("Student1 details are: "+"Name: "+sobj2.name+" "+"Roll NO: "+sobj2.rollno+" "+"Phone No: "+sobj2.Phno+" "+"Address: "+sobj2.address);
    }


    
}
