package Assignment3.Exercise2;

public class Parent {
   
    
        private void prints(){
             System.out.println("This is Parent class");
             
         }
     
         public static void main(String[] args) {
             
             Parent p = new Parent();
             Child c = new Child();
     
             p.prints();
             c.prints();
     }
     
    
}
