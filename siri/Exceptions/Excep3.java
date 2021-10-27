public class Excep3 {
    public static void validate(int age){
        if(age<18){
            throw new ArithmeticException("not eligible");
        }
        else{
            System.out.println("eligible to vote");
        }
    
    }
    public static void main(String[] args) {
        validate(15);
        System.out.println("rest of the code");
        
    }
    
}
