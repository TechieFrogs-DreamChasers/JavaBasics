public class Traingle1 {



    double area;
    double area1;
    //double semiperimeter;
    int a=3,b=4,c=5;
    double s;
    void Semi()
    {
        s=(a+b+c)/2;
    }
    void Area()
    {
        area1=s*(s-a)*(s-b)*(s-c);
        area=Math.sqrt(area1);
    }
    void display()
    {
        System.out.println(area);
    }
    public static void main(String[] args) {
        Traingle1 t=new Traingle1();
        t.Semi();
        t.Area();
        t.display();
    }
}
