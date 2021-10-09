package Inheritance;

public class Second{

    void display(){
        System.out.println("This is child class");
    }
    public static void main(String[] args) {
        Parent x1 = new Parent();
        Second x2 = new Second();
        x2.display();

        
    }
}


class Parent{

    private void display1(){
        System.out.println("This is parent class");
    }
    public static void main(String[] args) {
        Parent x2 = new Parent();
        x2.display1();
    }
    
}

    

