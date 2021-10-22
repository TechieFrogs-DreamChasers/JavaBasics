package Practice.Exceptions.ThrowKeyword;

public class ThrowUncheckedException {
    public static void main(String[] args) {
        
        //Throwing Unchecked Exception by using method
        validate(10);
        System.out.println("Rest of the code ");
        
    }

        public static void validate( int age){
            
            if(age<18){
                throw new ArithmeticException("Person is not eligible to vote ");           
            }
            else{
                System.out.println("Person is eligible to vote ");
            }       
        }
    
}
