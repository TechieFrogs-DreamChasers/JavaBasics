public class Child1 extends Parent1 {
    private void childdisplay(){
        System.out.println("child method");
       // super.parentdisply();
    }
    Child1(){
        System.out.println("child contructer");
    }
    public static void main(String[] args) {
        
        Child1 oChild1=new Child1();
        oChild1.childdisplay();
    
     // Parent1 oparent1=new Parent1();
     // oparent1.parentdisply();
      
   }
}
