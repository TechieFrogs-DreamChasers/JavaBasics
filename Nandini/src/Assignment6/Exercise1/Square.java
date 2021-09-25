package Assignment6.Exercise1;

public class Square implements RegularPolygon {

    int length;

    Square(int length){
        this.length = length;
    }
   
    public double getNumSides(){
        return 4;
    }

    public double getSideLength(){
        return length;
    }
    
}
