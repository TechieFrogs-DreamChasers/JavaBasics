package Exceptions9;

import java.util.Scanner;

public class UseCatchHandChainedException {
    public static void main(String[] args)  {
        int input;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number Of Pizzas: ");
        input = sc.nextInt();

        try{
            pizza(input);

        }catch(AtLeastOneException e){
            System.out.println(e.getMessage());
        }
        sc.close();
    }
  
    private static void pizzaDetails(int input) throws NullPointerException{

        if(input <=0 || input >100){
            
            NumberFormatException a = new NumberFormatException("====> NumberFormatException"); 

            a.initCause(new AtLeastOneException("====> It shouldn't more than 100 or equal to zero ")); 

            throw a; 
        }        
    }

    private static void pizza(int input) throws AtLeastOneException{
        if(input == 0){
            throw new AtLeastOneException("There is zero input");
        }

        try{
            pizzaDetails(input);
        }catch(NumberFormatException e){
            System.out.println("Message Of the Exception: "+ e.getMessage());
            System.out.println("Cause of the Exception "+ e.getCause());
            
        }
    }
}

class AtLeastOneException extends Exception{
    public AtLeastOneException(String s){
        super(s);
    }
}
