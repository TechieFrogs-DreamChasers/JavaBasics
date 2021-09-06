public class Rectangle {
    int width;
    int height;
    double area;

    public Rectangle(int width, int height) {
        this.width = width;
        this.height = height;
    }

    public static void main(String[] args) {
        Rectangle rectangle1=new Rectangle(4,5);
        rectangle1.printArea();
        Rectangle rectangle2=new Rectangle(5,8);
        rectangle2.printArea();
    }
    void printArea(){
        area=width*height;
        System.out.println("The Area of Rectangle: "+area);
    }
}
