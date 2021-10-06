package Assignment5;

public abstract class Bob {
    Bob(){
        System.out.println("This is a constructor");
    }
    abstract void a_method();
    void display(){
        System.out.println("This is non-abstract method");
    }
}
class BobJuniour extends Bob{
    void a_method(){
        System.out.println("This is an abstract method");
    }
    public static void main(String[] args) {
        BobJuniour BJ = new BobJuniour();
        BJ.a_method();
        BJ.display();
    }
}