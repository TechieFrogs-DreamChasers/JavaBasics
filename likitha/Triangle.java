
//import java.util.Scanner;

public class Triangle {
    double area;
    double area1;
    
        double perimeter;
        double s; //semi perimeter
        
        void Semiperimeter(int a,int b,int c)
        {

            s=(a+b+c)/2;

        }
        void Area(int a,int b,int c)
        {
            area1=s*(s-a)*(s-b)*(s-c);
            area=Math.sqrt(area1);
           // System.out.println(area);
        } 
        void display()
        {
            System.out.println("area of triangle:"+" "+area);
        }
        

    public static void main(String[] args) {
        Triangle sc=new Triangle();
        
        
        sc.Semiperimeter(3,4,5);
        sc.Area(3,4,5);
        sc.display();



        
    }
    
}
