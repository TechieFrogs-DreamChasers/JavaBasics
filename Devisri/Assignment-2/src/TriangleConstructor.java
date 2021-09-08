public class TriangleConstructor {
    int side1;
    int side2;
    int side3;
    double area;
    double perimeter;

    public TriangleConstructor(int side1, int side2, int side3) {
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    public static void main(String[] args) {
        TriangleConstructor triangle=new TriangleConstructor(3,4,5);
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
