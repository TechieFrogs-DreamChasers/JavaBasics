package Abtraction;

public abstract class Abparent {
    abstract void massage();

    
}
class Absub extends Abparent{
    void massage(){
        System.out.println("this is a first sub class");
    }
    //abstract  void massage();
}
 class Absub1 extends Absub{
    void massage(){
    
        System.out.println("this is a second subclass");
    }
      public static void main(String[] args) {
          Absub1 oAbsub1=new Absub1();
              oAbsub1.massage();
              Absub oAbsub=new Absub();
              oAbsub.massage();

                  
              }
          

      }
            
        
    

