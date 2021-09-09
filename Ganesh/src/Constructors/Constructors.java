package Constructors;

public class Constructors {
    String name;
    public Constructors(String s){
        name = s;
    }
    public Constructors(){
        name = "Unknown";
    }
    public static void main(String[] args){
        Constructors obj1 = new Constructors("Ganesh");
        Constructors obj2 = new Constructors();

       System.out.println(obj1.name);
        System.out.println(obj2.name);
    }
}
