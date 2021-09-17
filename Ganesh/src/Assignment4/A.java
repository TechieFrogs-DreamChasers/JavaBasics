package Assignment4;

public class A {
    static void display(){
        System.out.println("Parent");
    }
}
class B extends A{
    static void display(){
        System.out.println("Child");
    }

    public static void main(String[] args){
        A obj =  new A();
        obj.display();
        B obj1 = new B();
        obj1.display();
        A me = new B();
        me.display();

    }
}