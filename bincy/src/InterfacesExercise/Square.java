package InterfacesExercise;

public class Square implements RegularPolygon {
    int n ;
    int j ;
    public int getNumSides(){
        return n;
    }
    public int getSideLength(){
        return j;
    }

    Square(){
        n = 4;
        j = 20;
    }

    public void getPerimeter(){
        int peri = n*j;
        System.out.println(peri);
    }

    public void getInteriorAngle(){
        double angle = (n-2)*pi/n;
        System.out.println(angle);
    }

    public static void main(String... args){
        Square sq = new Square();
        System.out.println(sq.getNumSides()+" "+ sq.getSideLength());
        
    }
}
