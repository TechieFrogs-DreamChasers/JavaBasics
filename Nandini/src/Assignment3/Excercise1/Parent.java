package Assignment3.Excercise1;

public class Parent {
    
   void prints(){
        System.out.println("This is Parent class");
        
    }

    public static void main(String[] args) {
        
        Parent p = new Parent();
        Child c = new Child();

        p.prints();
        c.prints();
}
}
