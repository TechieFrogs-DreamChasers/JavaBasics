package Practice.InterviewPractice;

import java.util.Scanner;

public class PrimeNumber {
  
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a Number to Check Whether it is prime or not");
        int userInput = input.nextInt();
        
        if(primeNumber(userInput))
            System.out.println(userInput+ " is a PrimeNumber.");
        else
            System.out.println(userInput+ " is not a PrimeNumber.");
        input.close();
    }

    static boolean primeNumber(int checkNumber){

        if(checkNumber == 0 || checkNumber == 1){
            return false;
        }

        for(int i=2;i<=Math.sqrt(checkNumber);i++){

            if(checkNumber%i == 0){
                    return false;
            }
                
        }
        return true;
    }
}
