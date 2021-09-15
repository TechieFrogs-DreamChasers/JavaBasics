import java.util.Scanner;

public class RArea {
    int length,breadth;
    double area;

     void Area(int l,int b)
     {
         this.length=l;
         this.breadth=b;
     }
     double ReturnArea()
     {
         area=length*breadth;
         System.out.println(area);
         return area;
     }


    public static void main(String[] args) {
        RArea a=new RArea();
        Scanner sc=new Scanner(System.in);
        int l=sc.nextInt();
        int b=sc.nextInt();
        a.Area(l, b);
        a.ReturnArea();
        sc.close();
    }

    
}
