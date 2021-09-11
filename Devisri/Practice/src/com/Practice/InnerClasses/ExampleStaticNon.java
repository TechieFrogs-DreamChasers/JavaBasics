package com.Practice.InnerClasses;

/*
      --->
     "This program has Main_class->static Inner Class->Non-static inner class"
     Can have variables=static+Non-static variables
     Just like normal class. Can have n(No. of methods=static+non-static). n(No. of constructors)
     Now --> Can have Inner classes = static+Non-static
     1)If(Static Inner class){
           can access static variable directly(here name). In method, we can do this.
     } else{
           cannot access non-static members directly.
     }
   */
//Main class
public class ExampleStaticNon {
    //variables=static+non-static
    private static String name;
    private static String email;
    private boolean onSubmit;

    public ExampleStaticNon() {
        onSubmit = true;
        ExampleStaticNon.email = "will@email.com";
        ExampleStaticNon.name = "Will";
    }

    static void out_display() {//static method for main class
        ExampleStaticNon esn = new ExampleStaticNon();
        System.out.println(name + " " + email + " " + esn.onSubmit);//Prints all the members values
    }

    private static class Example1 {

        public Example1() {
            System.out.println("***Inside static inner Example1 class Constructor***");
            //out_display();possible
            //inn_Display();possible
        }

        private void inn_Display() {//non-static method in static inner class
            System.out.println(name + " " + email);//can't access instance onSubmit
            ExampleStaticNon exampleStaticNon = new ExampleStaticNon();
            System.out.println(exampleStaticNon.onSubmit);
        }

        public static void main(String[] args) {
            name = "Tom";
            email = "tom@email.com";
            System.out.println(name + " " + email);
            out_display();
            System.out.println("********");
            Example1 example1 = new Example1();
            example1.inn_Display();
        }

        private class Example2 {
            public Example2() {
                System.out.println("*** deep inner non-static Example2 class constructor***");
                out_display();//outer class static method
                inn_Display();//inner class non-static method
            }
        }
    }

    public static void main(String[] args) {
        //out_display();//static method of main class. No need of obj here
        Example1 example1 = new Example1();
        //to access deep non-static example class. Static inner Example class obj is needed.
        Example1.Example2 example2 = example1.new Example2();
    }
}
