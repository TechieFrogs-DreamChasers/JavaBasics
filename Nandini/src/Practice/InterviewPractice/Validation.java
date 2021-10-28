package Practice.InterviewPractice;

import java.util.Scanner;

//import javax.swing.plaf.synth.SynthOptionPaneUI;

public class Validation {
    public static void main(String[] args) {
        
        //user input
        Scanner keyBoard = new Scanner(System.in);

        //calling validate method
        validateInteger(keyBoard);
        validateString(keyBoard);

        //System.out.println();

    }

    static int validateInteger(Scanner scannerObj){
        
        //validate method definition
        int number;

        do{
           // System.out.println("Enter Positive Number: ");

            while(!scannerObj.hasNextInt()){
                System.out.println("This is not a Positive Number. Please enter positive Number: ");
                scannerObj.next();
            }

            number = scannerObj.nextInt();
        }while(number<=0);
        
        return number;

    }

    static String validateString(Scanner scannerObj){
        
        //validate method definition
        String string;

        do{
            //System.out.println("Enter Sentence: ");

            while(!scannerObj.hasNext("[A-Za-z]*")){
                System.out.println("This is not a String. Please enter valid String: ");
                scannerObj.next();
            }

            string = scannerObj.nextLine();
        }while(string.equals(""));
        
        return string;

    }
    
}
