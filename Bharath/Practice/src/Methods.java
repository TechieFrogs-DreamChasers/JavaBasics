

public class Methods {
    int i = 10;
   private String name = "Bharath";
   protected int j = 20;

    

    public static void main(String[] args) {
        System.out.println("in the main method1");
        Methods mobj = new Methods();
        mobj.i = 20;
        mobj.display1(4);
        Methods.display2("name", 6);
        Constructors sobj = new Constructors();//Different program
        sobj.f = 4.04f;
        System.out.println(sobj.f);
    }

    Methods(){
        System.out.println("in the constructor");
    }
    

    public void display(){
        
        System.out.println("In the first method");
    }

    public int display1(int i){
        display2("name", 9);
        System.out.println("In the second method"+"  "+i);
        
        return i;
    }

    static String display2(String name, int j){
        //int j = 30;

       System.out.println(name);
        return name;

    }

   
    
    
}
