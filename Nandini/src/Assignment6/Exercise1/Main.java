package Assignment6.Exercise1;

public class Main {

    public static void main(String[] args) {

        
        EquilateralTriangle triangle = new EquilateralTriangle(5);
        Square square = new Square(6);

        double[] rPolygons2 = {triangle.getNumSides(),square.getNumSides()};


        System.out.println("                ");
        System.out.println("Total Num of sides: "+ RegularPolygon.totalSides(rPolygons2));
        //System.out.println(RegularPolygon.getNumSides(7));

        System.out.println("                ");

        System.out.println("Number of Sides of Triangle: "+ triangle.getNumSides());
        System.out.println("Length of the Triangle: "+ triangle.getSideLength());
        System.out.println("Perimeter of Triangle: "+ triangle.getPerimeter());
        System.out.println("Interior of triangle: "+ triangle.getInteriorAngle());

        System.out.println("                ");

        System.out.println("Number of Sides of Square: "+ square.getNumSides());
        System.out.println("Length of the Square: "+ square.getSideLength());
        System.out.println("Perimeter of the Square: "+ square.getPerimeter());
        System.out.println("Interior of Square: "+ square.getInteriorAngle());

    }
    
}
    
    

