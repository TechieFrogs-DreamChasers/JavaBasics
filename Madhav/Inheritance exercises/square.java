class shape {

    void displayshape()
    {
        System.out.println("This is shape");
    }
    
}
class circle extends shape
{
    void displaycircle()
    {
        System.out.println("This is circle");
    }
} 
class rec extends shape
{
    void displayrectangle()
    {
        System.out.println("this is a rectangle"); 
    }
}
    
public class square extends rec
    {
        void displaysquare()
        {
            System.out.println("sqaure is a rectangle");
        }
    
    public static void main(String[] args) {
        square sq = new square();
        sq.displayrectangle();
        sq.displayshape();
    }


}
