package Methods;

public class A {


    static void print(){
        System.out.println("Parent");
    }
    
}

class B extends A{

    static void print(){
        System.out.println("Child");
    }
}

class Main1{

    public static void main(String[] args) {
        A x1 = new A();
        B x2 = new B();
        A.print();
        B.print();
        //x1.print();It's a static method, we have to call in a static way as above
        //x2.print();

        A obj = new B();
        obj.print();
    }
}
