package Assignment3;

public class ParentClass  {
    void display1(){
        System.out.println("This is Parent Class");
    }
public static void main(String[]args){
    ParentClass Obj1 = new ParentClass();
    Obj1.display1();
    ChildClass Obj2 = new ChildClass();
    Obj2.display();
    ChildClass Obj3 = new ChildClass();
    Obj3.display1();
}
}
