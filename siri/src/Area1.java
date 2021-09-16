import java.util.Scanner;

public class Area1 {
    int a=0,b=0;
    Area1(int x,int y){
        a=x;
        b=y;

    }
    public double returnarea(){
        double area=(a*b);
        return area;

    }
    public static void main(String[] args) {
        Scanner oScanner=new Scanner(System.in);
        
        System.out.println("enter value of a");
        int s=oScanner.nextInt();
        System.out.println("enter valu of b");
        int m=oScanner.nextInt();
        Area1 oArea1=new Area1(s, m);
        System.out.println("area is:"+oArea1.returnarea());
        oScanner.close();

        
    }

    
}
