public class Variables {
    //Constant variable declaration
    static final double PI;
    //Constant variable declaration & initialization
    static final String ERR_MSG = "Invalid Value";
    //Constant variable initialization using static block
    static {
        PI=3.14;
    }
    // Instance variables declaration and initialisation + above lines comes under instance variables
    int a=30;
    static int b=40;
    static float c= 5.0F;
    float d=5.0F;
    String s1="Jen";
    static String s2="Bobby";
    char ch='D';
    //final Variable declaration
    final String s;
    final int g;
    final double m;
    //final Variable declaration & initialization using initialisation block
    {
        s="Jimmy";
        g=190;
        m=1.5;
    }

    public static void main(String[] args) {
        //local variable's declaration & initialization
        //static keyword should not be used for local variables
        int a=10;
        //static int b=20; throws error as not allowed.
        int b=20;
        float c= 2.5F;
        float d=2.5F;
        String s1="John";
        String s2="Bob";
        //local variables using final keyword
        final String s;
        final int g;
        final double m;

        {
          s="Micky";
          g=90;
          m=10.5;
        }
        //Object creation for the class to access instance & local variables
        Variables var1=new Variables();
        System.out.println(a + " " +var1.a);
        var1.a=60;
        System.out.println(a + " " +var1.a);
        System.out.println((int)var1.ch+ " " +var1.ch);
        //Another object is created
        Variables var2=new Variables();
        System.out.println(d+ " " +var2.d);
        var2.s1="Benny";
        System.out.println(s1+ " " +var2.s1);
        //accessing static variables using class name as static variables does not need object to access them.
        System.out.println(Variables.b + " " +b);
        System.out.println(Variables.c + " " +c );
        System.out.println(Variables.s2 + " " +s2);
        //Another object is created.
        Variables var3=new Variables();
        //Using object to access another method of the class in main method
        var3.main();
        //Accessing instance variables & local variables
        System.out.println(s + " " +var3.s);
        System.out.println(g + " " +var3.g);
        System.out.println(m + " " +var3.m);
        //Accessing constant variable with class name as it is created using static keyword
        System.out.println(Variables.ERR_MSG);
    }
    public void main(){
        //char declaration & initialization
        char ch='d';
        System.out.println((int)ch + " " +ch);
        //displays instance variable values & they don't need any object or class to access them
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(g);
        System.out.println(PI);
    }
}
