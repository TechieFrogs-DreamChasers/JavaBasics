package diff;
import fafam.inter3;

public class interImplement implements inter3{
    public void method1()
    {
        System.out.println("Method 1");
    }
    public void method2()
    {
        System.out.println("Method 2");
    }
    public void method3()
    {
        System.out.println("Method 3");
    }
    public static void main(String[] args) {
        interImplement obj = new interImplement();
        obj.method1();
        obj.method2();
        obj.method3();
    }
    
}
