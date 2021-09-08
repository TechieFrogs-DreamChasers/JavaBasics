package assign;

public class Trianglepara {
    public Trianglepara(double a, double b, double c){

    double s= 0.0d;
    double area = 0.0d; 
    s= (a+b+c)/2;
    area = Math.sqrt(s*((s-a)*(s-b)*(s-c)));
    System.out.println("PERIMETER"+ " " + s);
    System.out.println("Area"+" "+area);
    }
    public static void main(String[]args){
        Trianglepara area = new Trianglepara(3,4,5);
        

    }
    


    
}
