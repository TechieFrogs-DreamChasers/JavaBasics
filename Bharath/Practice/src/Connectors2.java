public class Connectors2 {

    int a;
    int b;
    String name;
    float f;

    void test(){
        System.out.println(a+b);
    }


    public static void main(String[] args) {
        
        int i = 10;
        
        int j = 20;
        Connectors2 obj = new Connectors2();
        obj.a = 10;
        obj.b = 2;
        obj.f = 4;
        System.out.println(obj.a+" "+obj.name+" "+obj.f);


    }


    Connectors2(int a, int b){
        this.a=a;
        this.b=b;
        name = "bharath"; 
    }

    Connectors2(int a, String name){
        a=10;
        name = "Styring";   
    }

    Connectors2(){
        
    }

}
    
class Type{
    int k = 2;
    int l = 4;
    String m = "Testing";
    
    void display(){
         System.out.println("Type void");
    }
}
