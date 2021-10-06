package com.Practice.InnerClasses.Session.Rep;
//Focuses on Anonymous classes

//an interface
interface Banks {
    // abstract method
    void activities();
}

// an abstract class implementing interface
abstract class BankTimings implements Banks {
    // abstract method
    abstract void open();

    // instance method
    void close() {
        System.out.println("close()");
    }
}

// Driver class which is not implementing or extending
public class AnonClass {

    public static void main(String[] args)  {
        // Anonymous class implementing interface & its method
        Banks banks = new Banks() {
            @Override
            public void activities() {
                System.out.println("activities()");
            }
        };
        banks.activities();
        // Anonymous class inheriting abstract class & implementing its method
        // As shown above abstract class is implementing interface
        // An in abstract class there is no implementation provided for the interface
        // methods
        // This anonymous class which is inheriting abstract class
        // provides all the method implementations
        BankTimings bankTimings = new BankTimings() {
            @Override
            public void activities() {
                System.out.println("Inside abstract class activities()");
            }

            @Override
            void open() {
                System.out.println("open()");
            }
        };
        bankTimings.open();
        bankTimings.activities();
        bankTimings.close();

        // Anonymous classes representation
        // Object & class = creation,instantiation are done at a time
        System.out.println(" ");
        new Banks() {
            @Override
            public void activities() {
                System.out.println("This is anonymous activities()");
            }
        }.activities();
        System.out.println(" ");
        new BankTimings() {
            @Override
            void open() {
                System.out.println("This is anonymous open()");
                activities();
                close();
            }

            @Override
            public void activities() {
                System.out.println("activities() called");
            }
        }.open();

       /* Object o = new Object()
        {
            public int test = 5;
            public void sayHello()
            {
                System.out.println("Hello World");
            }
        };

        //o.sayHello();//Does not work

        try
        {
            Method m = o.getClass().getMethod("sayHello");
            Field f = o.getClass().getField("test");
            System.out.println(f.getInt(o));
            m.invoke(o);
        } catch (Exception e)
        {
            e.printStackTrace();
        }*/

       /* Object obj = new Object(){
            public void print(){
                System.out.println("Print executed.");
            }
        };

        obj.getClass().getMethod("print", null).invoke(obj, null);
        errors so we have to add these exceptions
        throws NoSuchMethodException, InvocationTargetException, IllegalAccessException
        */

    }
}
