package Assignment3.Excercise1;

public class Child extends Parent {
    
    void prints(){
        super.prints();
        System.out.println("This is Child Class");
    }

    public static void main(String[] args) {
        
        Parent p = new Parent();
        Child c = new Child();

        p.prints();
        c.prints();
        c.prints();
    }
}
