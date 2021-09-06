import java.util.Scanner;

public class Area {
    Scanner sc=new Scanner(System.in);
    int width= sc.nextInt();
    int height=sc.nextInt();
    public static void main(String[] args) {
        Area a=new Area();
        a.setDim(a.width, a.height);
        a.getArea();
    }
    void setDim(int width,int height){
        this.width=width;
        this.height=height;
    }
    void getArea(){
        double area=width*height;
        System.out.println("The Area of Rectangle is: "+area);
    }
}
