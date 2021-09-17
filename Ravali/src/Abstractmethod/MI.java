package Abstractmethod;
abstract class A{
    abstract void display();
}
abstract class B extends A{
    void display(){
        System.out.println("abstract method of class A");
    }
    abstract void show();
}
class C extends B{
    void show(){
        System.out.println("concrete class = abstract methods of a and b");
        }
    }


public class MI {
    public static void main(String[]args){
        C obj = new C();
        obj.display();
        obj.show();
    }
    
}
