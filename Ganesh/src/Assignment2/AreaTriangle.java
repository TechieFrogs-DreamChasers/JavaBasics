package Assignment2;

public class AreaTriangle {
    double s;
    double area;
    public AreaTriangle(double a,double b, double c){
         s = 0.0d;
         area = 0.0d;
        s = (a+b+c)/2;
        area  = Math.sqrt(s *((s-a)*(s-b)*(s-c)));
     
    }
    void display(){
        System.out.println("Parameter of the Triangle :"+s+"\nArea of Triangle : "+area);
    }
    public static void main(String[] args){
         AreaTriangle area = new AreaTriangle(3,4,5);
         area.display();
    }
    

}
