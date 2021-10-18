//Handle InstantiationException
public class Program17 {
    private int number1;
    private int number2;

    public Program17(int number1, int number2) {
        this.number1 = number1;
        this.number2 = number2;
    }

    public static void main(String[] args) {
        Class obj = Program17.class;
        try {
            obj.newInstance();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
        System.out.println("Out of Try+Catch Block");
    }
}

/*
java.lang.InstantiationException: Program17
	at java.base/java.lang.Class.newInstance(Class.java:639)
	at Program17.main(Program17.java:13)
Caused by: java.lang.NoSuchMethodException: Program17.<init>()
	at java.base/java.lang.Class.getConstructor0(Class.java:3585)
	at java.base/java.lang.Class.newInstance(Class.java:626)
	... 1 more
Out of Try+Catch Block
 */