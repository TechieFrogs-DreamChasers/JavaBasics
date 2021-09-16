package com.Practice.InnerClasses;

//Main Class
public class ExampleNONStatic {
    /*
       --->
      "This program has Main_class->Non-static Inner Class->static inner class"
      Can have variables=static+Non-static variables
      Just like normal class. Can have n(No. of methods=static+non-static). n(No. of constructors)
      Now --> Can have Inner classes = static+Non-static
      1)If(non-Static Inner class){
            cannot access static variable directly(here name). In method, we can do this.
      } else{
            can access only static members directly.
      }
    */

    private static String name;
    private String email;
    private boolean onSubmit;

    public ExampleNONStatic() {
        this("default@email.com", true);
        ExampleNONStatic.name = "Default";
    }

    public ExampleNONStatic(String email, boolean onSubmit) {
        this.email = email;
        this.onSubmit = onSubmit;
    }

    void out_Display() {//we can also have static method
        System.out.println(ExampleNONStatic.name + " " + email + " " + onSubmit);//name static
    }

    static void out_details() {//static method = static variables
        //System.out.println(name);
        ExampleNONStatic es = new ExampleNONStatic();
        System.out.println(name + " " + es.email + " " + es.onSubmit);//email,onSubmit=non-static
        //es.out_Display();//non-static method
    }

    //Nested class
    private class Example1 {
        //Inner Class=static+non-static members
        private boolean onCall;
        private static boolean callOn;

        public Example1() {
            this(true);
            Example1.callOn = false;
        }

        public Example1(boolean onCall) {
            this.onCall = onCall;
        }

        void inn_Display() {
            System.out.println(Example1.callOn + " " + onCall);
            //System.out.println(name+" "+email+" "+onSubmit);allowed
        }

        static void inn_Details() {
            ExampleNONStatic.name = "Saul";
            Example1.callOn = true;
            System.out.println(callOn + " " + name);//both are static
            //Outer class to access inner non-static values in this method
            ExampleNONStatic ex = new ExampleNONStatic();
            //using outer class obj to create inner class obj
            ExampleNONStatic.Example1 ex2 = ex.new Example1();
            //both objects and non-static value access in static method
            System.out.println(ex.email + " " + ex.onSubmit + " " + ex2.onCall);
            //Methods access
            ex.out_Display();
            ex2.inn_Display();
        }

        private static class Example2 {
            public Example2() {//both non-static methods in deep inner static class
                ExampleNONStatic exampleNONStatic = new ExampleNONStatic();
                exampleNONStatic.out_Display();
                Example1 example1 = exampleNONStatic.new Example1();
                example1.inn_Display();
            }

            public static void main(String[] args) {
                inn_Details();//inner class static method. Accessing in deep static inner class
                System.out.println("*******************");
                out_details();//outer class static method. Accessing in deep static inner class
                System.out.println("*****************");
                Example2 example2 = new Example2();//constructor calling displays all non-static methods
            }
        }

    }

    public static void main(String[] args) {
        ExampleNONStatic es2 = new ExampleNONStatic();
        //ExampleNONStatic.Example1 ex= es2.new Example1(); can do this if we want to access non-static members
        System.out.println("**************");
        Example1.inn_Details();
        System.out.println("**************");
        //inner non-static class.static class obj=new Inner non-static class.static class constructor.
        Example1.Example2 e2 = new Example1.Example2();
    }
}
