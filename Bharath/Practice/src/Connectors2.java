import TestPack.Encapsulation;

public class Connectors2 {

    int a;
    int b;
    String name;
    float f;

    void test(){
        System.out.println(a+b);
    }
    public static void main(String[] args) {
        

    }


    //public static void main(String[] args) {
       
        
        int i = 10;
        
        int j = 20;
        Connectors2 obj = new Connectors2();
        obj.a = 10;
        obj.b = 2;
        obj.f = 4;
        System.out.println(obj.a+" "+obj.name+" "+obj.f);


    }


    /*Connectors2(int a, int b){
        this.a=a;
        this.b=b;
        name = "bharath"; 

        System.out.println("First constructor");
    }

    Connectors2(int a, String name){
        a=10;
        this.name = "Styring";  
        System.out.println("Second one"); 
    }

    Connectors2(){
        this(10, "h");
        System.out.println("Default");

    }

}*/
    
class Type{
    int k = 2;
    int l = 4;
    String m = "Testing";

    public static void main(String[] args) {
        Type tobj = new Type();

        
    }
    
    void display(){
         System.out.println("Type void");
    }
    Type(){

    }

    Type(int q, String name){
        System.out.println("First connector");
    }

    Type(String color, int w){
        this(10, "tyep");
        System.out.println("Second");
    }

    Type(int e, String car, int r){
        this();
        System.out.println("Third");
    }
}


