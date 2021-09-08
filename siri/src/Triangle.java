public class Triangle {

    int a=3,b=4,c=5;
    
    
    public Triangle(){

    }
    
    public static void main(String[] args) {
        Triangle oTriangle=new Triangle();
    double perimeter=oTriangle.a+oTriangle.b+oTriangle.c;
    System.out.println("perimeter of tringle is " + perimeter);
    double s=(oTriangle.a+oTriangle.b+oTriangle.c)/2;
    double area=(Math.sqrt(s*(s-oTriangle.a)+s*(oTriangle.b)+s*(s-oTriangle.c)/2));
        System.out.println("area of tringle is " + area);
         
            
        }
        
    }
    

