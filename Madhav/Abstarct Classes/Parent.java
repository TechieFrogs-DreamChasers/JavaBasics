public abstract class Parent
{
    abstract void message();
    public static void main(String[] args) {

        SubClass1 sc1 = new SubClass1();
        SubClass2 sc2 = new SubClass2();
        sc1.message();
        sc2.message();
        
    }
}
class SubClass1 extends Parent
{
    void message()
    {
        System.out.println("Subclass 1");
    }
}
class SubClass2 extends Parent
{
    void message()
    {
        System.out.println("Subclass 2"); 
    }
}