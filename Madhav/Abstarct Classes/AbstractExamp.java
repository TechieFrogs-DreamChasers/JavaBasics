public abstract class AbstractExamp {
    AbstractExamp()
    {
        System.out.println("This is constructor of abstract class");
    }
    abstract void a_method();
    void n_method()
    {
        System.out.println("This is normal method of abstract class");
    }
    public static void main(String[] args) {
        Mama m=new Mama();
        m.a_method();
        m.n_method();
    }
    
}
class Mama extends AbstractExamp{
    void a_method()
    {
        System.out.println("This prints abstract method");
    }
}
