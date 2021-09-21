package PRACTICE;

public class Outer {
    void outerMethod(){
        System.out.println("In outer method");
    }
    class Inner{
        public static void main(String[] args){
            System.out.println("Inside static method");
        }
        static void myDisplay(){
            System.out.println("In mydisplay");
        }
    }
    
}
class OtherOuter{
    public static void main(String[] args){
        Outer out = new Outer();
        Outer.Inner inner = out.new Inner();
        Outer.Inner.myDisplay();
    }
}
