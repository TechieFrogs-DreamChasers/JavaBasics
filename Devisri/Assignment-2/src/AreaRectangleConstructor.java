import java.util.Scanner;

public class AreaRectangleConstructor {
    int height;
    int breadth;
    public AreaRectangleConstructor(int height, int breadth) {
         this.height= height;
         this.breadth=breadth;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int height= sc.nextInt();
        int breadth=sc.nextInt();
        AreaRectangleConstructor arc=new AreaRectangleConstructor(height,breadth);
        arc.getArea();
        sc.close();
    }
    void getArea(){
        double area=breadth*height;
        System.out.println("The area of Rectangle is: "+area);
    }
}
