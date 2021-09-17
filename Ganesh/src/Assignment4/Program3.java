package Assignment4;

public class Program3 {
    void area(double s){
        System.out.println("Area of Square :"+(s*s));
    
    }
    void area(double l,double b){
        System.out.println("Area of Rectangle : "+(l*b));
    }

public static void main(String[] args){
    Program3 me = new Program3();
    me.area(32.5);
    me.area(5,9);
}

}


