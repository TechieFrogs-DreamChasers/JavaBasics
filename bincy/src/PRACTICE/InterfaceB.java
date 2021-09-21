package PRACTICE;

public interface InterfaceB {
    int j = 45;//public static final
    void drag();//public abstract
    void draw();
    default void delete(){
        System.out.println("In static drop");
    }
}
