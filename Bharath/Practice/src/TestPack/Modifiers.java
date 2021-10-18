package TestPack;

public class Modifiers extends Encapsulation{

    int i;
    static String name;
    private int j;

    public static void main(String[] args) {
        System.out.println("In the main");
        Encapsulation qObj = new Encapsulation();
        System.out.println(qObj.getI());
         
    }

    void display(){
        System.out.println(i+name+j);
    }
    
    Modifiers(){
        System.out.println("In the constructor"+i+j+name);
    }
    
}
