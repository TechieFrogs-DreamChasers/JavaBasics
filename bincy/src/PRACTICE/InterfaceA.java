package PRACTICE;

public interface InterfaceA {
    int i =12;//public static final i=12
    private void display(){
        System.out.println("In display");
    }       //public abstract void display()
    default void myDisplay1(){
        display();
    }
    int move();
    void draw();
    /*
    public static void main(String[] args){
        System.out.println("In main");
        
    }*/
    
}

