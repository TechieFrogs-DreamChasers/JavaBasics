package ExceptionAssignment;
//Multiple Exceptions. Must maintain the order of exceptions, most specific to most general
public class P10 {
    public static void main(String[] args){
                   
            try{    
                 int a[]={10,20,30,40,50};
                   
                 a[5]=30/0;    
                 System.out.println(a[10]); 
                 String s =null;
                 System.out.println(s.length()); //NullPointerException Since no such exception ,Parent excepion will invoke.
                }    
                catch(ArithmeticException e)  
                   {  
                    System.out.println("Arithmetic Exception occurs");  
                   }    
                catch(ArrayIndexOutOfBoundsException e)  
                   {  
                    System.out.println("ArrayIndexOutOfBounds Exception occurs");  
                   }    
                catch(Exception e)  
                   {  
                    System.out.println("Parent Exception occurs");  
                   }             
                System.out.println("rest of the code");    
        

    }
}
        
    


   /*
    public class Main {
       double method(int i) throws Exception {
          return i/0;
       }
       boolean method(boolean b) {
          return !b;
       }
       static double method(int x, double y) throws Exception {
          return x + y ;
       }
       static double method(double x, double y) {
          return x + y - 3;
       }   
       public static void main(String[] args) {
          Main mn = new Main();
          try {
             System.out.println(method(10, 20.0));
             System.out.println(method(10.0, 20));
             System.out.println(method(10.0, 20.0));
             System.out.println(mn.method(10));
          } catch (Exception ex) {
             System.out.println("exception occoure: "+*/
/*    class NewClass1 { 
       void msg()throws Exception{System.out.println("this is parent");}
    }
    class NewClass extends NewClass1 {
       NewClass() {
       }
       void msg()throws ArithmeticException{System.out.println("This is child");}
       public static void main(String args[]) {
          NewClass1 n = new NewClass();
          try {
             n.msg();
          } catch(Exception e){}
       }  
    }*/
    

