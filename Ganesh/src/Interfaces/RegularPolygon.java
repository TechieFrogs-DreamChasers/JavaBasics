package Interfaces;

public interface RegularPolygon {
    final static double pi = 3.14;
    abstract int getNumSides();
    abstract void getSideLength();

    default double getPerimeter(int n, double length){
        
        double perimeter = n*length;
        return perimeter;
    }

    default double getInteriorAngle(int n){
        double angle = ((n-2)*180)/n;
        //angle = (angle*(pi/180));
        return angle;
    }

}

class EquilateralTriangle implements RegularPolygon {
    double length;
    public int getNumSides(){
        
        return 3;
    }
    
    EquilateralTriangle(double length){
        this.length = length;
        getSideLength();
    }
    public void getSideLength(){
        System.out.println("Length of the side :"+this.length);
    }
   
    
}

class Square implements RegularPolygon{
    double length;
    @Override
    public int getNumSides() {
        // TODO Auto-generated method stub
        return 4;
    }
    @Override
    public void getSideLength() {
        System.out.println("Length of the side :"+length);
        
    }
    Square(double length){
        this.length = length;
        getSideLength();
    }

    public static void main(String[] args) {
        EquilateralTriangle et = new EquilateralTriangle(5);
        System.out.println("Number of Sides :"+et.getNumSides());
        Square s = new Square(98.58);
        System.out.println("Number of sides :"+s.getNumSides());
        System.out.println("Perimeter of Equalient Triangle with side length 5 :"+et.getPerimeter(et.getNumSides(), 5)+"\nPerimeter of square with side length 98.58 :"+s.getPerimeter(s.getNumSides(), 98.58));
        //et.getPerimeter(et.getNumSides(), 5);
        System.out.println("Interior Angle of Triangle and Square :"+et.getInteriorAngle(et.getNumSides())+", "+s.getInteriorAngle(s.getNumSides()));
        
    }
}
