package Assignment3.Exercise11;

public class Cylinder extends Circle{
    
    private double height;
    double area;

    Cylinder(){
    }

   Cylinder(double radius){
        super(radius);       
    }

    Cylinder(double radius,double height){
        super(radius);
        this.height = height;
    }

    Cylinder(double radius,double height,String color){
        super(radius,color);
        this.height = height;    
    }

    public double getHeight(){
        return height;

    }
    public void setHeight(double height){
        this.height = height;
    }

    public double getVolume(){
        //return PI * getRadius() * getRadius() * height;
        System.out.println("Volume: ");
        return (super.getArea()*height);
    }

    @Override
    public double getArea(){
        System.out.println("Area Of the Circle:");
        System.out.println(super.getArea());
        System.out.println("Area of Cylinder is: ");
        //return 2 * PI * getRadius() * (getRadius() + height);
        return 2*PI*getRadius()*getHeight()+2*(super.getArea());
    }

}
