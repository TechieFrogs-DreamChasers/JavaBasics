public class Excep1 {
    
   public static void main(String[] args) {
    int a=10;
    int b= 20;
     int c=30;
       try{
           System.out.println(" the sum is : " + (a+b+c));
       }
       catch(ArithmeticException ex){
System.out.println(ex);
       }
       
   }
   
    
}
