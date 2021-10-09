import TestPack.Encapsulation;

//import Constructors.NestedInner.Method1;

public class Constructors{
    
int i = 2;
private String name = "Bharath";
protected float f = 3.04f;
static int k;


 class Inner{
     
    int j = 10;
    String java = "java";
     static void display(){
         
         System.out.println("In inner class display"+" "+k);
         
     }

     Inner(){
         System.out.println("In inner class constructor"+" "+k);
     }
}
    static class NestedInner{
        
        public static void main(String[] args) {

            Constructors nestObj = new Constructors();
            System.out.println("In the nested inner"+nestObj.name);
           
        }
        static void display(){
            Constructors exObj = new Constructors();
            System.out.println("In inner display"+" "+exObj.name);

             /*class Method1{
                 public static void main(String[] args) {
                    Constructors netObj = new Constructors();
                     System.out.println("In method1"+" "+netObj.i);
                    
                }*/
            
        }
        public class Method1 {
        }
    }
  int sum(){
     int z = i + 10;
     return z;

  }
    
//public static void main(String[] args) {
    System.out.println("In the main method");
    Constructors cObj = new Constructors();
    Methods qObj = new Methods();//Different program
    qObj.display();
    qObj.j= 20;
    Constructors.Inner inObj = cObj.new Inner();
    System.out.println(inObj.java);
    Inner.display();
   // Constructors.NestedInner.Method1 metObj = cObj.new Method1();


    
}

Constructors(){
    this("Sample", 2.03f, false);
    Constructors.k = 20;
    System.out.println(k);
 System.out.println("default"+k+name);
}
Constructors(int i){
    this(3, 4);
 System.out.println("First constructor");

}
Constructors(int i, int j){
    System.out.println("Second Constructor");
}
Constructors(String name, float f, boolean b){
    this(5);
    System.out.println("Third Constructor");
}
} 