package PRACTICE;

public interface InterfaceB {
    int j = 45;//public static final
    void drag();//public abstract
    void draw();
    default void delete(){//When you want to add new functionality to the existing one without disturbing previous implementation
        System.out.println("In default delete");
        priDisplay();

    }
    
    static void display(){
        System.out.println("In static method of InterfaceB");
    }
    private void priDisplay(){
        System.out.println("In private method of InterfaceB");
    }
    class Inner{
        int a;
        int b;
        void innerDisplay(){
            System.out.println("Inner Display");
        }
        Inner(){
            innerDisplay();
        }
    }
        
}
