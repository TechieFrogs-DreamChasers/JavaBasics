//Handle ClassNotFoundException
public class Program12 {
    public static void main(String[] args) {
        try {
            System.out.println("Class Name: ");
            System.out.println(Class.forName("MyException"));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
/*class MyException{
    MyException(){
        System.out.println("This is MyException class");
    }
}*/
/*
Class Name:
java.lang.ClassNotFoundException: MyException
	at java.base/jdk.internal.loader.BuiltinClassLoader.loadClass(BuiltinClassLoader.java:641)
	at java.base/jdk.internal.loader.ClassLoaders$AppClassLoader.loadClass(ClassLoaders.java:188)
	at java.base/java.lang.ClassLoader.loadClass(ClassLoader.java:520)
	at java.base/java.lang.Class.forName0(Native Method)
	at java.base/java.lang.Class.forName(Class.java:375)
	at Program12.main(Program12.java:6)

 */