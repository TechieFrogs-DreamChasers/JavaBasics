package Assignment6.Exercise1;

public interface RegularPolygon {
  
    abstract double getNumSides();
    abstract double getSideLength(); 

    static double totalSides(double[] rPolygons){
        int total = 0;

        for (int i = 0; i < rPolygons.length; i++) {
            int sum = (int) ((rPolygons[i]));
            
           total += sum;
        }
        return total;
        
    }
    
    default double getPerimeter(){

        double perimeter = 0;
        perimeter = getNumSides() * getSideLength(); 
        return perimeter;

    }

    default double getInteriorAngle(){
        double angle = 0;
        angle = (getNumSides() - 2)* 180;
        return angle;
        
    }

}
