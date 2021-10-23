package ExceptionAssignment;

import java.util.Scanner;


//Exception handling by using throw
public class P3 {
    public static void main(String[] args){
        System.out.println("Enter age: ");
        Scanner obj = new Scanner(System.in);
        int age; 
        try{
        if(!obj.hasNextInt()) 
            throw new InvalidInput("Invalid");
        else{
            age =obj.nextInt();
            
        }
        }catch(InvalidInput ie){
            System.out.println(ie.getMessage());
            age =12;
        }finally{
            obj.close();
        }
        //obj.close();
        if(age<18){
            throw new ArithmeticException("Not eligible for voting. ");
        }
        else{
            System.out.println("Eligible for voting. ");
        }  
        if(age>60)  {
            StringIndexOutOfBoundsException se = new StringIndexOutOfBoundsException("Senior citizen ");
            throw se;
        }
        
    }
}
class InvalidInput extends Exception{
    public InvalidInput(String msg){
        super(msg);
    }

}

