package Assignment6.Exercise1;

public class EquilateralTriangle implements RegularPolygon {

    int length;

    EquilateralTriangle(int length){
        this.length = length;
    }
   
    public double getNumSides(){
        return 3;
    }

    public double getSideLength(){
        return length;
    }
    
}
