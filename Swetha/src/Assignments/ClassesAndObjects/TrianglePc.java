package Assignments.ClassesAndObjects;

public class TrianglePc {
    int side1;
    int side2;
    int side3;
    double area;
    double perimeter;
TrianglePc(int s1,int s2,int s3){
    side1=s1;
    side2=s2;
    side3=s3;
}
public static void main(String[] args) {
    TrianglePc triangle=new TrianglePc(3,4,5);
    triangle.area();
    triangle.perimeter();
}
void area(){
    double s=( side1+side2+side3)/3;
        area=Math.sqrt(s*(s-side1)*(s-side2)*(s-side3));
        System.out.println("Area of Triangle is :"+area);
    }
    void perimeter(){
        perimeter=side1+side2+side3;
        System.out.println("Perimeter of Triangle is:"+perimeter);

    }

}