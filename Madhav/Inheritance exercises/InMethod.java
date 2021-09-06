class java extends Ex{
    void childclass()
    {
        System.out.println("This is parent class");
    }
}
public class InMethod extends java{
    
    void display()
    {
        System.out.println("This is child class");
    }
    public static void main(String[] args) {
        InMethod ch = new InMethod();
        ch.display();
        ch.childclass();
        System.out.println(ch.getI());
        ch.setI(50);
        System.out.println(ch.getI());
    }
}