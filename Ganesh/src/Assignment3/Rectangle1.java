package Assignment3;

public class Rectangle1 extends Shape {
    void displayRectangle(){
        System.out.println("This is Rectangle");
    }
    public class Square extends Rectangle1 {
        void displaySquare(){
            System.out.println("Square is Rectangle");
        
        } 
   }
public static void main(String[] args){
    Square s1 = new Square();
    s1.displayRectangle();
    s1.displayShape();
   }
}