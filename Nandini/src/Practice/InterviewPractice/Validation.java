package Practice.InterviewPractice;

import java.util.Scanner;

public class Validation {
    public static void main(String[] args) {
        
        //user input
        Scanner keyBoard = new Scanner(System.in);

        //calling validate method
        validate(keyBoard);

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
    
}
