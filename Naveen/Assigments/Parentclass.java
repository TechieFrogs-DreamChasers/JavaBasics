public class Parentclass {
    public void pmethod(){
        System.out.println("This is parent class");
      }
    
    class Cclass extends Parentclass{
      public void cmethod(){
        System.out.println("This is child class");
      }
    }
    
    class Ans{
      public static void main(String[] args){
        Parentclass m = new Parentclass();
        Cclass n = new Cclass();
        m.pmethod();
        n.cmethod();
        n.pmethod();
      }
    }
}
