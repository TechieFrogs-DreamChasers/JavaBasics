package AbstractClassAssignmt;

public abstract class Shapes {
 protected String color;
 protected Boolean filled;
 
 Shapes(){

 }

 Shapes(String color, Boolean filled){

 }

 public String getColor(){
     return "Red";
 }
 public void setColor(String color){
     this.color = color;
 }

 public Boolean isFilled(){
     return false;
 }

 public void setFilled(Boolean filled){

 }

 public abstract double getArea();
 public abstract double getPerimeter();
 public String toString(){
     return "Red";
 }


 
}

class Circle extends Shapes{
    protected double radius = 1.0;
    Circle(){

    }
    Circle(double radius){

    }
    Circle(double radius, String color, Boolean filled){

    }
    public double getRadius(){
        return 13.5;
    }
    public void setRadius(double radius){

    }
    public double getArea(){
        return 3.5;
    }
    public double getPerimeter(){
        return 3.5;
    }
    public String toString(){
        return "red";
    }
}

class Rectangle extends Shapes{
    protected double width = 1.0;
    protected double length = 1.0;

    Rectangle(){

    }
    Rectangle(double width, double length){

    }
    Rectangle(double width, double length, String color, Boolean filled){

    }
    public double getWidth(){
        return width;
    }
    public void setWidth(double width){
        this.width = width;
    }
    public double getLength(){
        return length;
    }
    public void setLength(){
        this.length = length;
    }
    public double getArea(){
        return 3.5;
    }
    public double getPerimeter(){
        return 3.4;
    }
    public String toString(){
        return "Rectangle";
    }


}
class Square extends Rectangle{
    Square(){

    }
    Square(double side){

    }
    Square(double side, String color, Boolean filled){

    }
    public double getSide(){
        return 3.5;
    }

    public void setSide(double side){

    }
    public void setWidth(double side){

    }
    public void setLength(double side){

    }
    public String toString(){
        return "Square";
    }
}