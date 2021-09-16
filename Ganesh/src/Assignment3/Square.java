package Assignment3;

public class Square extends Rectangle{
    Square(){
        super(2.5d,4.5d);
    }
    Square(double s){
        super(s,s);
    }
    
    public static void main(String[] args){
        Square n = new Square(5);
        Square n1 = new Square();
    }


}
