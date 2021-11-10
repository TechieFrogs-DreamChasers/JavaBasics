package INHEITANCEASGN;

public class Child extends Parent {
   void showchild() {
       System.out.println("This is child class");
   }

   public static void main(String[] args){
       Child child = new Child();
       child.num = 20;
       child.show();
       child.showchild();
   }
}
