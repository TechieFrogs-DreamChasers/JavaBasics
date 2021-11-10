package INHEITANCEASGN;
/* Private variables and methods cannot be accessible in child
*/

public class Parent {//1. Parent and child class
    public int num =10;
    public static void main(String[] args){
        
        Parent parent =new Parent();
        parent.show();
    }

    void show(){
        System.out.println("This is parent class");
    }
    
    
}
