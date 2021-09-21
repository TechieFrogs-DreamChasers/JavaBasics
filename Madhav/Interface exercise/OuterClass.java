
public class OuterClass 
{ 
// An instance method of class OuterClass. 
   public void display()
  { 
// Declaration of a method local inner class. 
    class InnerClass 
    { 
       public void msg(){ 
        System.out.println("I am in Local inner class"); 
       } 
     } 
// Now, create an instance of a method local inner class and call the msg() method using object reference variable ic. 
     InnerClass ic = new InnerClass(); 
       ic.msg(); 
  } 
public static void main(String[] args) 
{ 
// Create an object of the outer class OuterClass. 
     OuterClass oc = new OuterClass(); 
       oc.display(); 
   } 
}