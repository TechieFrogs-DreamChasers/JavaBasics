package nestedclasspractice;

public class innerclass {//outer class is called as enclosing class
    static int n;
    int i;
    private String s;
    void displayout(){
        System.out.println(" First method of outer class");
        //inner class cannot be accessed
        Myinnerclass innerobj = new Myinnerclass(); 
        //innerobj.j,k,b,diplay method all innerclass objects can be accessed
        innerobj.display();
        int k=10;
        
    }
    class Myinnerclass{
        private int k;
        public boolean b;
        int j;

        void display(){
            System.out.println("Inner Class method");
            System.out.println("accessing outer class variables"+" "+n+" "+s+" "+i);
            //static, private can be accessed without object creation
            System.out.println("Accesing Inner elements"+" "+j+" "+k+" "+b);
            System.out.println("accessing outer class displayout method");
            //displayout();//calling outer method 
            // Inner class can access outer class content but outer class cannot access inner class content//


        }
        Myinnerclass (){
            System.out.println("Inner class constructor");
        }
        Myinnerclass(int i){
            this();//calling default constructor - constructor chaining
            System.out.println("Inner class parameterised constructor");
        }
        class Secondinnerclass{//nested class
            int a;
        }



    }
    public static void main(String[]args){
        innerclass outerobj =new innerclass();//outer class object, Instance creation
       // innerclass.Myinnerclass innerobj = outerobj.new Myinnerclass();
        //Inner object is created using outer object reference
       // outerclass.innerclass objname = outerclassobjname new innerclass();
       //innerclass(); can be any constructor
      // innerobj.display();//reason  for creation is to access inner class
      //innerobj.b,j,k,displaymethods
      //outerobj.displayout();
     // displayout();
     outerobj.displayout();// will result in infinite loop
     
     
    

    }
}
