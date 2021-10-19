package Practice.Exceptions;

public class FinallyBlock {
    public static void main(String[] args) {
        
        //Used to execute the important code such as closing the connection
        //finally block in Java can be used to put "cleanup" code such as closing a file, closing connection, etc.
        //The important statements to be printed can be placed in the finally block.
        //For each try block there can be zero or more catch blocks, but only one finally block.
        //The finally block will not be executed if the program exits (either by calling System.exit() 
        //or by causing a fatal error that causes the process to abort).

        //where there is no Exception
        /*try{

            int data = 20/5;
            System.out.println(data);
        }catch(NullPointerException e){
            System.out.println(e);
        }finally{
            System.out.println("Finally block");
        }
        System.out.println("rest of the code");*/




        //There is an exception but not handled
        try{
            System.out.println("Inside try block");
            int data = 20/0;
            
        }catch(NullPointerException e){
            System.out.println(e);
        }finally{
            System.out.println("Finally block");
        }
        System.out.println("rest of the code");


       
        //There is an exception handled
        /*try{
            System.out.println("Inside the try block");
            int data = 20/0;
            
        }catch(ArithmeticException e){
            System.out.println(e);
            System.out.println("Handled by the catch ");
        }finally{
            System.out.println("Finally block");
        }
        System.out.println("rest of the code");*/
    }
    
}
