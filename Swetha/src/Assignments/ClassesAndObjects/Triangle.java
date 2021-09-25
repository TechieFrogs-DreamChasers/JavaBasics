package Assignments.ClassesAndObjects;

public class Triangle {
    int s1;
    int s2;
    int s3;
    double area;
    double perimeter;
    Triangle(){
        s1=3;
        s2=4;
        s3=5;
        }
    public static void main(String[] args) {
        Triangle triangle=new Triangle();
        triangle.areaOfTriangle();
        triangle.perimeterOfTriangle();
        
    }
    void areaOfTriangle(){
        double s=( s1+s2+s3)/3;
        area=Math.sqrt(s*(s-s1)*(s-s2)*(s-s3));
        System.out.println("Area of Triangle is :"+area);
    }
    void perimeterOfTriangle()
    {
        perimeter=s1+s2+s3;
        System.out.println("Perimeter of Triangle is:"+perimeter);
    }
    
}
