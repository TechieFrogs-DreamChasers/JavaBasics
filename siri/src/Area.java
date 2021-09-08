import java.util.Scanner;

public class Area {
    int a=0,b=0;
     public void setdim(int x,int y){
         a=x;
         b=y;
        }
    public double getarea(){
        double area= a*b;
        return area;
    }
    public static void main(String[] args) {
        Scanner oScanner=new Scanner(System.in);
        System.out.println("enter lenth of a is:");
        int s=oScanner.nextInt();
        System.out.println("enter breath of b is:");
        int m =oScanner.nextInt();
        Area oarea=new Area();
        oarea.setdim(s, m);
        System.out.println("area is "+oarea.getarea());
    

        oScanner.close();
        
    }
    
}
