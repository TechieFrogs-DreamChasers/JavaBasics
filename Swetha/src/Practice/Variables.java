package Practice;

class StaticDemo{
     static int a=10;
    static void display(){
        System.out.println("Static Method");
    }
    static{
        System.out.println("Static Block");
    }
}
class MainClass{
    public static void main(String[] args) {
        System.out.println(StaticDemo.a);//accessing static variable using class name.
        StaticDemo.display();//accessing static method using class name.
    }

}