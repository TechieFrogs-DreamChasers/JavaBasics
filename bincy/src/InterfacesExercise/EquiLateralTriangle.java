package InterfacesExercise;//Program 1

public class EquiLateralTriangle implements RegularPolygon {
    int j;
    int n;
    public int getNumSides(){
        return n;
    }
    public int getSideLength(){
        return j;
    }
    EquiLateralTriangle(){
        j=25;
    }
    public void getPerimeter(){
        int peri = n* j;
        System.out.println("perimeter" + peri);
    }
    public void getInteriorAngle(){
        double angle = (n-2)*pi/n;
        System.out.println("Angle"+ angle);
    }
    public static void main(String... args){
        EquiLateralTriangle equi = new EquiLateralTriangle();
        System.out.println(equi.getNumSides()+" "+ equi.getSideLength());
    }
}
