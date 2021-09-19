import java.util.Scanner;

interface RegularPolygon{
    int getNumSides();
    int getSideLength();
    
    static int totalside()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no of polygons");
        int n = sc.nextInt();
        int RegularPolygon[] = new int[n];
        for(int i=0 ; i < n; i++)
        {
            RegularPolygon[i] = sc.nextInt();
        }
        int total = 0;
        for(int j = 0 ; j<n ; j++)
        {
            total += RegularPolygon[j];
        }
        return total;
    }
    default int getPerimeter(int s,int l)
    {
        return s*l;
    }
    

    
}
class EquiTriangle implements RegularPolygon{
    int i;
    public int getNumSides()

    {
        return 3;
    }
    public int getSideLength(){
        return i;
    }
    EquiTriangle(int s)
    {
        this.i=s;
    }
   
    
}
class Square implements RegularPolygon{
    

    int s;
    public int getNumSides()

    {
        return 4;
    }
    public int getSideLength(){
        return s;
    }
    Square(int s)
    {
        this.s=s;
    }
    
     
}
public class Interface1{
    public static void main(String[] args) {
     
       System.out.println("total sides are"+RegularPolygon.totalside());
        Square sq = new Square(6);
        
        System.out.println("No.of sides in a square is "+sq.getNumSides());
        System.out.print("The perimeter of square is ");
        System.out.println(sq.getPerimeter(sq.getNumSides(),sq.getSideLength()));
        EquiTriangle eq = new EquiTriangle(4);
        System.out.println("No.of sides in a square is "+eq.getNumSides());
        System.out.print("The perimeter of Equilateral triangle is ");
        System.out.println(eq.getPerimeter(eq.getNumSides(),eq.getSideLength()));
    }
    
}

