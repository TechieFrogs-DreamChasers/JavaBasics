

public class Example extends mmessage{
    void method1() // outer abstract method
    {
        System.out.println("outer abstract method");
        
        
    }
    abstract class newdemo{
        abstract void met();
        void innerclass()
        {
            System.out.println("inner class from child class which is inherted from abstract class");
        }

    }
    class a extends innerclass{ //inner class of child class "Example" - extended inner class of abstract class "mmesage"

        
        void method()   // inner abstract method
        {
            System.out.println("outer abstract method");
            
        }
   
    public static void main(String[] args) {

        Example ob = new Example();
        Example.a ob1 = ob.new a();
        ob.method1();
        ob1.method();
        

        
    }  
}   
    
}
abstract class  mmessage{

    abstract void method1();

    static abstract class innerclass{
        abstract void method();
        void name(){
            System.out.println("non abstract in inner class");
        }
    }

}


class  D extends Example{
    class C extends newdemo{
        void met()
        {
            System.out.println("baba");
        }
        

    public static void main(String[] args) {
        D b = new D();
        D.C ob2 = b.new C();
        ob2.met();
        ob2.innerclass();
    }

    
    
}
}
