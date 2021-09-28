package InterfacesExercise;

public interface RegularPolygon {
    double pi = 3.14;
    
    int getNumSides();
    int getSideLength();
    static void totalSides(){
        System.out.println("Sum of number of sides");
    }
    default void getPerimeter(){
       System.out.println("Perimeter");
    }

    default void getInteriorAngle(){
        System.out.println("Interior angle");
    }

}
