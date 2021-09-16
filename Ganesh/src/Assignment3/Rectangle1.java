package Assignment3;

public class Rectangle1 extends Shape {
    void displayRectangle(){
        System.out.println("This is Rectangle Shape");
    }
}
class Square2 extends Rectangle1 {
    void displaySquare(){
        System.out.println("Rectangle is Square");
  }

public static void main(String[] args){
    Square2 s1 = new Square2();
    s1.displaySquare();
    s1.displayShape();
 }
}