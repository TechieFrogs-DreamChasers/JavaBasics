public interface Regularpolygon {
    
    int getNumSides();
    int getSideLength( int i);
    static int totalsides(){ 
        return 4;

    }
    
}
class EquilaterTrangle implements Regularpolygon{
    int i;
    public int getNumSides(){
        return 3;
     }
    

    
    EquilaterTrangle(int b){
        this.i=b;
    }
    @Override
    public int getSideLength( int i) {
        
        return i;
    }

}
class Square implements Regularpolygon{

    int number;
    Square(int a){
        this.number=a;
    }
@Override
public int getSideLength(int i) {
    return 0;
}
@Override
public int getNumSides() {
    
    return 4;
}
public static void main(String[] args) {
    
}
  
    }

