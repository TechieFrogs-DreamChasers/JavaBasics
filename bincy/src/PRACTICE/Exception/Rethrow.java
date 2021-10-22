package PRACTICE.Exception;
//rethrow an exception
public class Rethrow {
    public static void test1(){
        System.out.println("In test1 ");
        throw new ArithmeticException("Divide by zero");
    }
    public static void test2(){
        
        
        try{
            test1();
            int a;
            a=25/0;
            System.out.println(a);
        }catch(ArithmeticException ae){
            System.out.println("In test2"  );
            throw ae;
        }
            
    }
    public static void main(String[] args){
        try{
            test2();
        }catch(ArithmeticException ae){
            System.out.println("Inside main");
        }
    }
}
