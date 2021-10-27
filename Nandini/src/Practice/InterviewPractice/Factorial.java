package Practice.InterviewPractice;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Number to give Factorial Value: ");
        int checkFactorial = input.nextInt();
        input.close();

        factorialResult(checkFactorial);
    
    }

    static void factorialResult(int factorialNumber){

        int result = 1;
        for(int i=1;i<=factorialNumber;i++){
            result = result*i;
        }

        System.out.println(result);
    }
    
}
