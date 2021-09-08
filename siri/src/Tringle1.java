public class Tringle1 {
    int a=0,b=0,c=0; 
    
    public Tringle1(int x,int y,int z){
    a=x;
    b=y;
    c=z;
    }
    
    public static void main(String[] args) {
        Tringle1 oTriangle=new Tringle1(10,15,20);
     double perimeter=oTriangle.a+oTriangle.b+oTriangle.c;
    System.out.println("perimeter of tringle is " + perimeter);
    double s=(oTriangle.a+oTriangle.b+oTriangle.c)/2;
    double area=(Math.sqrt(s*(s-oTriangle.a)+s*(s-oTriangle.b)+s*(s-oTriangle.c))/2);
        System.out.println("area of tringle is " + area);
         
            
        }
        
    
}
