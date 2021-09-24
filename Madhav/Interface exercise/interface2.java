public interface interface2
{
    int i=10;
    void inter2();
    interface innerinterfaceclass{
        int a=11;
        void innerinterface();
        static void staticmethod()
        {
            System.out.println("inner static meethod");
        }
    }
}
interface interface3
{
    void inter3();
    default String printnum()
    {
        return "super class";
    }
    static String mad()
    {
        return "Mad method";
    }

}
class ex implements interface2,interface3,interface2.innerinterfaceclass{

    public void innerinterface()
    {
        System.out.println("Inner class method");
    }

    static String mad()
    {
        return "madhav child class";
    }

   
     public String printnum()
    {
        return "child class";
    }

    public void inter2()
    {
        System.out.println("Interface 2 class");
        System.out.println(interface3.super.printnum());
    }

    public void inter3()
    {
        System.out.println("interface 3 class");
    }
    public static void main(String[] args) {
        ex Ex = new ex();
        System.out.println(interface2.i);
        Ex.inter2();
        Ex.inter3();
        System.out.println(Ex.printnum());
        System.out.println(ex.mad());
        interface2.innerinterfaceclass obj = new ex();
        System.out.println(interface2.innerinterfaceclass.a);
        obj.innerinterface();
        interface2.innerinterfaceclass.staticmethod();
        
        
        
    }

    

    
}