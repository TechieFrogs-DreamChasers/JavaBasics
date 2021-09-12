package PRACTICE;

public class StaticNestedClass {
    int i;
    static int j;
    protected int k;

    void displayOut(){
        System.out.println("In outer display");
    }

    static private void displayOutStatic(){
        System.out.println("In outer static method");

    }

    StaticNestedClass(){
        System.out.println("In outer constructor");
    }

    static  class Inner{
        int a;
        static int b;
        protected String name;

        static void sum(){ //static method
            System.out.println(b);
            //System.out.println(name + " "+ a +" ");// WE cannot make a static reference to non_static field name
        }
        Inner(){
            System.out.println("Inside Inner");
        }
        void display(){
            System.out.println("Inside Inner method");
            displayOutStatic();
            //System.out.println(i + " " + " "+ k);// cannot make static reference
            System.out.println(j);
            
        }
        public static void main(String[] args){
            System.out.println("In inner class main");
        }
    }

    public static void main(String[] args){
      StaticNestedClass outer = new StaticNestedClass() ; //creating outer class object
      System.out.println(outer.i+ " "+StaticNestedClass.j+" "+outer.k);
      outer.displayOut();
      StaticNestedClass.displayOutStatic();//Calling in static way

      StaticNestedClass.Inner innner = new StaticNestedClass.Inner();//creating inner class object
      System.out.println(innner.a+" "+Inner.b+" "+innner.name);
      innner.display();
      Inner.sum();
      

      Inner inn = new Inner(); //creating inner class object
      System.out.println(inn.a+" "+Inner.b+" "+inn.name);
      inn.display();
      Inner.sum();
      
      
    }
    
}
