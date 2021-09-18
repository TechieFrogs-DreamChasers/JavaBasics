package Assignment5.Exercise4;

abstract class Constructorclass {
    
    Constructorclass(){
        System.out.println("This is Constructor of AbstractClass");
    }

    abstract void a_method();

    void non_abstract(){
        System.out.println("This is a normal method of abstract class");
    }

    
}
