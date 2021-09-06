package Assignment2;

public class Rectangle {
    public Rectangle(double length,double breath){
        double area = (length*breath)/2;
        System.out.println("Area of Rectangle : " + area);
    }
    public static void main(String[] args){
        Rectangle areaobj = new Rectangle(4,5);
        Rectangle areaobj1 = new Rectangle(5,8);
    }
    
}

