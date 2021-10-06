package polymorphism;

public class MO{
void add(int x, int y){
    System.out.println("addition of"+ (x+y));
    
}
void add(int a, int b, int c){
    System.out.println("add 3"+" "+(a+b+c));
}
void add(double x, double y){
    System.out.println("sum of double"+" "+(x+y));
}
public static void main(String[]args){
    MO ob= new MO();
    ob.add(10.0D,20.0D);
    ob.add(10,20,30);
    ob.add(10,20);
    
}
}