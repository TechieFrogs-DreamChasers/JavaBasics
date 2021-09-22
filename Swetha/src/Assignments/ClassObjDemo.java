package Assignments;

class Student            //we can have 'n' number of classes in a file but we cannot give all classes as public
{                        //as public is given to only Driver class which contains main method.
    int rollno;
    String name;
    void details()
    {
        System.out.println("In Student Class");
    }
}

public class ClassObjDemo {
    int i;
    static int j;
    void display() 
    {
        System.out.println("In Display Method");
    }
    
     public static void main(String[] args) {
         ClassObjDemo clob=new ClassObjDemo();//creating an instance i.e, creating an Object.                 
         clob.i=10;// initialising Instance variables with object reference.istance variables have separate
         ClassObjDemo.j=20;                           //memory allocation                    
         System.out.println(clob.i);//Accessing istance variables with an Object reference.
         System.out.println(clob.j);//printing the value of an object
         clob.display();
         ClassObjDemo clob1=new ClassObjDemo();//we can crete 'n' number of objects to a class
         clob1.i=5;
         ClassObjDemo.j=15;
         System.out.println(clob1.i);
         System.out.println(ClassObjDemo.j);
         System.out.println(clob.i+" "+clob1.i+" "+ClassObjDemo.j); //for static variables memory is created 
         clob1.display();                                                        //only once
         Student stobj = new Student();//here in main method,we can create instance for our own class and other 
         stobj.details();                //accesible classes
        System.out.println(stobj.rollno);
        Student stobj1 = new Student();
        stobj1.details();
        stobj1.rollno=8;//initialising instance variables with object reference os second object of student class
        System.out.println(stobj1.rollno);

        
    }
    
}
