package Assignment5;


public abstract class Shapes {
    protected String colour = "Red";
    protected boolean filled = true;

    Shapes(){

    }

    Shapes(String colour,boolean filled){
        this.colour = colour;
        this.filled = filled;
    }
    String getColour(){
        return colour;
    }
    void setColour(String colour){
        this.colour = colour;
    }
    boolean isFilled(){
        return filled;
    }
    void setFilled(boolean filled){
        this.filled = filled;
    }
   
    abstract double getArea();
    abstract double getPerimeter();
    public String toString(){
        String s = "Shape [ Colour = "+colour+", filled = "+filled+"]";
        return s;
    }

    public static void main(String[] args) {
       
        
        Squares obj3 = new Squares(5,"Blue",true);
       
        Squares obj4 = new Squares();
        obj4.toString();
        System.out.println(obj4.toString());
        System.out.println(obj3.getArea());
        
    }
   
}

class Circles extends Shapes {
    protected double radius = 1.0;
    final static double pi = 3.14;
    Circles(){

    }
    Circles(double radius){
        this.radius = radius;
    }
    Circles(double radius,String colour,boolean filled){
        this.radius = radius;
        this.colour = colour;
        this.filled = filled;
    }
    double getRadius(){
        return radius;
    }
    void setRadius(double radius){
        this.radius = radius;
    }
    double getArea(){
        double area = pi*(radius*radius);
        return area;
    }
    double getPerimeter(){
        double Perimeter = 2*pi*radius;
        return Perimeter;
    }
    public String toString(){
        String s = "Circle [ Shape [ Colour = "+this.colour+", Filled = "+this.filled+"] radius = "+this.radius+"]]";
        return s;
    }
}

class Rectangles extends Shapes {
    protected double width = 1.0;
    protected double length = 1.0;
    Rectangles(){

    }
    Rectangles(double width,double length){
        this.width = width;
        this.length = length;
    }
    Rectangles(double width, double length, String colour, boolean filled){
        this.colour = colour;
        this.filled = filled;
        this.width = width;
        this.length = length;       

    }
    double getwidth(){
        return this.width;
    }
    void setWidth(double width){
        this.width = width;
    }

    double getLength(){
        return this.length;
    }
    void setLength(double length){
        this.length = length;
    }
    double getArea(){
        double area = length*width;
        return area;
    }

    double getPerimeter(){
        double Perimeter = 2*(length+width);
        return Perimeter;
    }
    public String toString(){
        String s = "Rectangle [ Shapes [ colour = "+colour+", filled = "+filled+", width = "+this.width+", Length = "+this.length+"]]";
        return s;
    }

}

class Squares extends Rectangles {
    protected double side = 1.0;
    Squares(){

    }
    Squares(double side){
        this.side = side;

    }
    Squares(double side, String colour, boolean filled){
        this.side = side;
        this.colour = colour;
        this.filled = filled;
    }
    double getSide(){
        return this.side;
    }
    void setSide(double side){
        this.side = side;
    }
    void setWidth(double side){
        this.width = side;
        
    }
    void setLength(double side){
        this.length = side;
    }
    public String toString(){
        String s = "Square [ Rectangle [Shape [ Colour = "+colour+", Filled = "+filled+",width = "+side+"Length + "+side+"]]]";
        return s;
    }
}

