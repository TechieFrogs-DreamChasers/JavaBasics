package src.Asg3;

public class Shape {
     void shape1()
    {
        System.out.println("this is shape");
    }


    public static void main(String[] args) {
        Square obj=new Square();
        obj.shape1();
        obj.Rec();
       // obj.Sq();
    }
    
}
class Rectangle extends Shape{
    void Rec(){
        System.out.println("this is rectangle");
    }

}
class Circle extends Shape{
    void Cir(){
        System.out.println("this is circle");
    }
}
class Square extends Rectangle{
    void Sq()
    {
        System.out.println("square is rectangle");
    }
}
