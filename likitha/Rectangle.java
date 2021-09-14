public class Rectangle {
    double area;

    void Area(int l,int b)
    {
area=l*b;
    }
    void display()
    {
        System.out.println(area);
    }




    public static void main(String[] args) {
        Rectangle r=new Rectangle();
        r.Area(4,5);
        r.display();
        r.Area(5,8);
        r.display();
        
    }
}
