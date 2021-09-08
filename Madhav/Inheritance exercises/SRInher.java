class Rectangle {

    int len,breadth;
    Rectangle(int x, int y)
    {
        len = x;
        breadth = y;

    }
    void area()
    {
        System.out.println("The area of rectangle is "+(len*breadth));
    }
    void per()
    {
        System.out.println("The perimeter of rectangle is "+2*(len*breadth));

    }
    
}
public class SRInher extends Rectangle{
    SRInher(int s)
    {
        super(s,s);
        System.out.println("The area of square is "+(s*s));
        System.out.println("The per of square is "+(4*s));
       
    }
    public static void main(String[] args) {
        SRInher sr = new SRInher(3);
        sr.per();
        sr.area();
        
    }
}
