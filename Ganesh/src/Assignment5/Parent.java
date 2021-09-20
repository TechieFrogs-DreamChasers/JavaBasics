package Assignment5;


public abstract class Parent {
    abstract void message();
    
}
class FirstSubclass extends Parent{
   
    void message(){
        System.out.println("This is first subclass");
    }
}
class SecondSubClass extends Parent{
    void message(){
        System.out.println("This Second subclass");
    }
    public static void main(String[] args){
        
        SecondSubClass obj = new SecondSubClass();
        obj.message();
        FirstSubclass obj2 = new FirstSubclass();
        obj2.message();
       

        }
}
