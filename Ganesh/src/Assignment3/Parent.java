package Assignment3;

public class Parent {
    private void display(){
        System.out.println("This is Parent Class");
    }
    public static void main(String[]args){
        Parent obj1 = new Parent();
        obj1.display();
        Child obj2 = new Child();
        obj2.display();
    }
}
