public class Rec {

    double length;
    double breadth;
    double area;
    double p;
    Rec(double l,double b){
        this.length=l;
        this.breadth=b;
        area=l*b;
        //l=10;
        //b=20;
        p=2*(l+b);
    }
    void Area(){
        System.out.println(area);
       // return area;

    }
    void Perimeter(){
      
System.out.println(p);

    }

    /*void display()
    {
        System.out.println(area);
        System.out.println(p);
    }*/
}
class Square extends Rec{
  /* Square(){
    super(2,3); 
    }*/
    Square(double s){
        super(s,s);
    }
    public static void main(String[] args) {
        Rec r=new Rec(2,3);
        r.Area();
        r.Perimeter();
        //r.display();
        //Square s=new Square();
       // s.Area(2, 3);
       // s.display();
        Square s1=new Square(5);
        
       s1.Area();
       s1.Perimeter();
        //s1.display();
    }
}
