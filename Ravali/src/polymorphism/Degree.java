package polymorphism;

public class Degree {
    void getdegree(){
        System.out.println("I got a degree");
        
}
   class Ug{
       void getdegree(){
           System.out.println("I am a undergraduate");
       }
    }
class Pg{
    void getdegree(){
        System.out.println("I am a postgraduate");
    }
}
    
   public static void main(String[]args){
       Degree ob = new Degree();
       ob.getdegree();
       Degree.Ug ob1 = ob.new Ug();
       ob1.getdegree();
      Degree.Pg ob2 = ob.new Pg();
      ob2.getdegree();
     


   }
}
