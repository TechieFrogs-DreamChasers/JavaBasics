package ClassesAndObjects;

public class Triangle {
    int side1 = 23;
    int side2 = 46;
    int side3 = 41;
    public static void main(String[] args){
        Triangle triangle = new Triangle();
        triangle.triArea();
        Triangle triangle2 = new Triangle(3,4,5);

    }
    Triangle(){

    }
    Triangle(int s1,int s2,int s3){
        side1 = s1;
        side2 = s2;
        side3 = s3; 
    }
    void triArea(){
        int perimeter = side1+side2+side3;
        System.out.println("Perimeter: "+ perimeter);
        double side = (perimeter)/2;
        //System.out.println(side);
        double area = (side*(side-side1)*(side-side2)*(side-side3));
        //System.out.println(area);
        area = Math.pow(area,0.5);
        System.out.println("Area : "+ area+ " sq.unit");

    }
}
