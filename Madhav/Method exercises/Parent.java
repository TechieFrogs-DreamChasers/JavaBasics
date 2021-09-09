public class Parent extends child {

    static void display()
    {
        System.out.println("Parent");
    }
    public static void main(String[] args) {
        
        Parent a = new Parent();
        a.display();
        child ch = new child();
        ch.display();
        child obj = new Parent();
        obj.display();

    }
    
}
class child{
    static void display()
    {
        System.out.println("child");
    }
}
