public class DataTypes {
    static final double GOLDEN_RATIO=1.61;
    static final String ERR_MSG="Invalid Entry";

    int num1=100;
    byte num2=12;
    short num3=65;
    long num4=750;
    float num5=1.5F;
    double num6=2.5D;
    char ch='D';
    boolean isVar=true;
    String string="Define";

    static int n1=100;
    static byte n2=12;
    static short n3=65;
    static long n4=750;
    static float n5=1.5F;
    static double n6=2.5D;
    static char cha='D';
    static boolean isvar=true;
    static String s="Define";

    final String s1="Input Value";
    final long a=1800;
    final double b=8.75d;

    public static void range(){
        System.out.println("Byte range is " +Byte.MIN_VALUE + " to " +Byte.MAX_VALUE);
        System.out.println("Short range is " +Short.MIN_VALUE + " to " +Short.MAX_VALUE);
        System.out.println("Integer range is " +Integer.MIN_VALUE + " to " +Integer.MAX_VALUE);
        System.out.println("Long range is " +Long.MIN_VALUE + " to " +Long.MAX_VALUE);
        System.out.println("Float range is " +Float.MIN_VALUE + " to " +Float.MAX_VALUE);
        System.out.println("Double range is " +Double.MIN_VALUE + " to " +Double.MAX_VALUE);
        //System.out.println("Character range is " +Character.MIN_VALUE + " to " +Character.MAX_VALUE);
    }

    public static void main(String[] args) {
        System.out.println("**** Accessing range() which displays primitive data types range *****");
        //range() is a static method
        range();
        DataTypes dt=new DataTypes();
        System.out.println("**** Accessing localAccess() *****");
        dt.localAccess();
        System.out.println("**** Accessing Instance variables with object *****");
        System.out.println(dt.num1);
        System.out.println(dt.num2);
        System.out.println(dt.num3);
        System.out.println(dt.num4);
        System.out.println(dt.num5);
        System.out.println(dt.num6);
        System.out.println((int)dt.ch+ " " +dt.ch);
        System.out.println(dt.isVar);
        System.out.println(dt.string);

        System.out.println("**** Accessing final and constant instant variables with another object *****");
        DataTypes dt1=new DataTypes();
        System.out.println(dt1.s1);
        System.out.println(dt1.a);
        System.out.println(dt1.b);
        System.out.println(DataTypes.GOLDEN_RATIO);
        System.out.println(DataTypes.ERR_MSG);

        System.out.println("**** Accessing static variables with class name *****");

        System.out.println(DataTypes.n1);
        System.out.println(DataTypes.n2);
        System.out.println(DataTypes.n3);
        System.out.println(DataTypes.n4);
        System.out.println(DataTypes.n5);
        System.out.println(DataTypes.n6);
        System.out.println((int)DataTypes.cha+ " " +DataTypes.cha);
        System.out.println(DataTypes.isvar);
        System.out.println(DataTypes.s);

    }

    public void localAccess(){
        int num1=200;
        byte num2=15;
        short num3=95;
        long num4=9500l;
        float num5=3.5F;
        double num6=9.5D;
        char ch='h';
        boolean isVar=false;
        String string="fine";

        final String s2;
        final long a;
        final double b;
        {
            s2="Output Value";
            a=2900;
            b=6.75d;
        }

        //System.out.println("**** Accessing local variables *****");

        System.out.println(num1);
        System.out.println(num2);
        System.out.println(num3);
        System.out.println(num4);
        System.out.println(num5);
        System.out.println(num6);
        System.out.println((int)ch+ " " +ch);
        System.out.println(isVar);
        System.out.println(string);
        System.out.println(s2);
        System.out.println(a);
        System.out.println(b);
    }

}
