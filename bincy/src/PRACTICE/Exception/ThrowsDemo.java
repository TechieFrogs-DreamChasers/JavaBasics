package PRACTICE.Exception;

public class ThrowsDemo {
    public static void main(String[] args){
        try{
            sum();
        }catch(ArithmeticException ae){
            System.out.println("Arithmetic");
        }
    }
    public static void sum()throws ArithmeticException{
        int x= 0;
        int y = 5;
        int z =y/x;
        System.out.println(x+" "+ y+ " "+ z);
    }
}
