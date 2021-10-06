package INHEITANCEASGN; //6.

public class Square1 extends Rectangle1{
    void squareDisplay(){
        System.out.println("Square is a rectangle.");
    }

    public static void main(String[] args){
        Square1 square = new Square1();
        square.squareDisplay();
        square.shapeDisplay();
        square.rectangleDisplay();
    }
}
