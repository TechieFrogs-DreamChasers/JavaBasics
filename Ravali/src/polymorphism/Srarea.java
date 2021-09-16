package polymorphism;

public class Srarea {
    
    void area(float l, float w){
System.out.println("Area of Rectangle = "+" "+(l*w));
    }
    void area(float s){
        System.out.println("Area of square ="+" "+(s*s));
    }

    public static void main(String[]args){
        Srarea ob = new Srarea();
        ob.area(10.5F, 15.5F);
        ob.area(10.0F);
    }
}
