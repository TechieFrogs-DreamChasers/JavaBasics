public class Triangle {
    int side1;
    int side2;
    int side3;
    double area;
    double perimeter;

    public Triangle() {
        side1=3;
        side2=4;
        side3=5;
    }

    public static void main(String[] args) {
        Triangle triangle=new Triangle();
        triangle.printArea();
        triangle.printPerimeter();
    }
    void printArea(){
        double s = (side1 + side2 + side3) / 2;
        area=Math.sqrt(s*(s-side1)*(s-side2)*(s-side3));
        System.out.println("The area of Triangle is: "+area);

    }
    void printPerimeter(){
        perimeter=side1+side2+side3;
        System.out.println("The perimeter of Triangle is: "+perimeter);
    }
}
