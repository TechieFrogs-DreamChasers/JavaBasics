import java.util.Scanner;

public class Area {

    int length,breadth;
    double area;

    public void setDim(int l,int b)
    {
        this.length=l;
        this.breadth=b;
    }
    double getArea()
    {
        area=length*breadth;
        System.out.println(area);
        return area;
       

    }
    public static void main(String[] args) {
        Area a=new Area();
        Scanner sc=new Scanner(System.in);
        int l=sc.nextInt();
        int b=sc.nextInt();

       a.setDim(l,b);
    a.getArea();
sc.close();
    }
    
}
