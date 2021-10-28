package Practice.InterviewPractice;

import java.util.Scanner;

public class Validation {
    public static void main(String[] args) {
        
        //user input
        Scanner keyBoard = new Scanner(System.in);

        //initializing variables
        int firstIntegerValue;
        int secondIntegerValue;
        String string;

        //calling validate method
        firstIntegerValue = validate(keyBoard);
        secondIntegerValue = validate(keyBoard);

        string = validation(keyBoard);
        System.out.println("String:  "+ string);

        //Handling the Exceptions
        try{
            int result = firstIntegerValue+secondIntegerValue;
            System.out.println("Addition of Two Numbers: "+result);

            System.out.println("FirstInteger is Palindrome or not");
            int resultp = palindrome(firstIntegerValue);
            if(resultp==firstIntegerValue)
                System.out.println("Palindrome");
            else
                System.out.println("Not Palindrome ");

        }catch(NumberFormatException e){
            System.out.println("Error: "+e.getMessage());
        }
    }


    static int palindrome(int number){

        int sum=0,r;
	    while(number!=0)
	    {
	    r=number%10;
	    sum=(sum*10)+r;
	    number/=10;	
	    }
	return sum;
    }


    static int validate(Scanner scannerObj){
        
        //validate method definition
        int number;

        do{
            System.out.println("Enter Positive Number: ");

            while(!scannerObj.hasNextInt()){
                System.out.println("This is not a Positive Number. Please enter positive Number: ");
                scannerObj.next();
            }

            number = scannerObj.nextInt();
        }while(number<=0);
        return number;
    }



    static String validation(Scanner scannerObj){

        String stringValue;

        do{
            System.out.println("Enter String Value: ");
            while(!scannerObj.hasNext("[A-Za-z]*")){
               System.out.println("This is not a String value, Please Enter String: "); 
               scannerObj.next();
            }
            stringValue = scannerObj.nextLine();

        }while(stringValue.equals(""));

        return stringValue;
    }
    
}
