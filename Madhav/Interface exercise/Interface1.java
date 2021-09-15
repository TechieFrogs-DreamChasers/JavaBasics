interface RegularPolygon{
    int getNumSides();
    int getSideLength();
    default void Perimeter()
    {
        
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
    public void getPerimeter()
    {
        System.out.println("Perimeter is "+(i*getNumSides()));
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
    public void getPerimeter()
    {
        System.out.println("Perimeter is "+(s*getNumSides()));
    }
     
}
public class Interface1{
    public static void main(String[] args) {
        Square sq = new Square(6);
        System.out.println("No.of sides in a square is "+sq.getNumSides());
        sq.getPerimeter();
        EquiTriangle eq = new EquiTriangle(4);
        System.out.println("No.of sides in a square is "+eq.getNumSides());
        eq.getPerimeter();
    }
    
}

