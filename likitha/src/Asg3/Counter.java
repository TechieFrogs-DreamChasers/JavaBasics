package src.Asg3;

public class Counter {
    void increment()
    {
        int i=3;
        System.out.println(i);
    }
    
}
class C1 extends Counter{
    public static void main(String[] args) {
        C1 obj=new C1();
        obj.increment();
    }
}
