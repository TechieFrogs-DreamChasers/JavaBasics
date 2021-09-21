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
       // A obj =  new A();
        A.display();
       // B obj1 = new B();
        B.display();
        A me = new B();
        me.display();

    }
}