
import java.util.Scanner;

public class Triangle {
    double area;
        double perimeter;
        void Area(int height,int breadth)
        {
            area=(height*breadth)/2;
        }
        

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int height=sc.nextInt();
        int breadth=sc.nextInt();



        sc.close();
    }
    
}
