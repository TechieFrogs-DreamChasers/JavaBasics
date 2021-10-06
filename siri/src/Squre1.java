public class Squre1 extends Rectangle1 {
    int side;
    void sarea(){
        System.out.println("area is:"  + (side*side));
    }
    void sparameter(){
        System.out.println("sparameter: "+4*side);
    }
    Squre1(int a){ 

        super(10, 15);
        this.side=a;

    }
    public static void main(String[] args) {
        Squre1 oSqure1 =new Squre1(10);
        oSqure1.area();
        oSqure1.parameter();
        oSqure1.sarea();
        oSqure1.sparameter();
    }
    
}
