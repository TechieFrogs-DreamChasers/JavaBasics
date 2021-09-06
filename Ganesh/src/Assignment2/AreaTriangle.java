package Assignment2;

public class AreaTriangle {
    
    public AreaTriangle(double a,double b, double c){
        double s = 0.0d;
        double area = 0.0d;
        s = (a+b+c)/2;
        area  = Math.sqrt(s *((s-a)*(s-b)*(s-c)));
        System.out.println("Parameter of the Triangle : "+s);
        System.out.println("Area of triangle :"+area);
    }
    public static void main(String[] args){
         AreaTriangle area = new AreaTriangle(3,4,5);
    }
    

}
