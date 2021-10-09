package Inheritance;

public class First extends Second1 {

    void display(){
        System.out.println("This is child class");
    }
    public static void main(String[] args) {
        First x1 = new First();
       
        Second1 x2 = new Second1();
        x2.display1();
        x1.display();
        x1.display1();
        
    }
}


class Second1{

    void display1(){
        System.out.println("This is parent class");
    }
}
