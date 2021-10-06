public interface Regularpolygon {
    
    void getNumSides();
    void getSideLength();
    static int totalsides(){ 
        return 4;

    }
    
}
class EquilaterTrangle{
    int i;
    public int getNumSides(){
        return 3;

    }
    public int getSideLength(int i){
        return i;

    }
    

    
    EquilaterTrangle(int b){
        this.i=b;
    }

}
class Square{

    int number;
    Square(int a){
        this.number=a;
    }

    public int getNumSides(){
        return 4;
    }
    public int getSideLength(){
        return number;
 

 }
 public static void main(String[] args) {
     
 }
  
    }

