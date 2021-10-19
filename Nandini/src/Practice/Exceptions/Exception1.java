package Practice.Exceptions;

import java.io.PrintWriter;
import java.io.FileNotFoundException;

public class Exception1 {
    public static void main(String[] args) {
       
        //Normal Try and catch 
       try{
            //specifies code for the exception 
            int data = 100/0;
        }catch(ArithmeticException e){
            //handle the exception
            System.out.println(e);
        }
        System.out.println("rest of the code");


        //Giving the rest of the code inside Try block
        /*try{
            //specifies code for the exception 
            int data = 100/0;
            System.out.println("rest of the code");
        }catch(ArithmeticException e){
            //handle the exception
            System.out.println(e);
        }*/


        //Using the Parent Class Exception
        /*try{
            //specifies code for the exception 
            int data = 100/0;
        }catch(Exception e){
            //handle the exception
            System.out.println(e);
        }
        System.out.println("rest of the code");*/


        //Custom Message on Exception
        /*try{
            //specifies code for the exception 
            int data = 100/0;
        }catch(Exception e){
            //handle the exception
            System.out.println("Can't Divide by Zero");
        }*/


        //Resolve the Exception in a Catch block
        /*int i = 20;
        int j = 0;

        try{
            //specifies code for the exception 
            int data = i/j;
        }catch(ArithmeticException e){
            //handle the exception
            //resolve the exception in catch block
            System.out.println(i/(j+2));
        }*/


        //Along with try block we can also enclose Exception code in catch block
        /*try{
            //specifies code for the exception 
            int data1 = 100/0;
        }catch(Exception e){
            //generating the exception in catch block
            int data2 = 100/0;
        }
        System.out.println("rest of the code");*/


        //Handle to generate a Exception(Arithemetic Exception) with a different type of Exception class (ArrayIndexoutofBoundsException)
        /*try{
            //specifies code for the exception 
            int data = 100/0;
        }
        // try to handle the ArithmeticException using ArrayIndexOutOfBoundsException
        catch(ArrayIndexOutOfBoundsException e){
            //handle the exception
            System.out.println(e);
        }
        System.out.println("rest of the code");*/


        //Handle another unchecked exception
        /*try{
            //specifies code for the exception 
            int[] data = {1,2,3};
            System.out.println(data[10]);
        }
        // try to handle the ArithmeticException using ArrayIndexOutOfBoundsException
        catch(ArrayIndexOutOfBoundsException e){
            //handle the exception
            System.out.println(e);
        }
        System.out.println("rest of the code");*/


        //Example to handle Checked Exception
        /*PrintWriter pw;
        try{
            //specifies code for the exception 
            pw = new PrintWriter("jtp.txt");
            pw.println("saved");
            
        }
        // try to handle the ArithmeticException using ArrayIndexOutOfBoundsException
        catch(FileNotFoundException e){
            //handle the exception
            System.out.println(e);
        }
        System.out.println("File Saved Successfully");*/
        


        
        
    }
    
}
