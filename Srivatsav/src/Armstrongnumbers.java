import java.util.Scanner;

public class Armstrongnumbers {
    public static void main(String[] args) {
        int originalNumber, remainder, result = 0, n = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        int num = sc.nextInt();

        originalNumber = num;

        for (;originalNumber != 0; originalNumber /= 10, ++n);

        originalNumber = num;

        for (;originalNumber != 0; originalNumber /= 10)
        {
            remainder = originalNumber % 10;
            result += Math.pow(remainder, n);
        }

        if(result == num)
            System.out.println(num + " is an Armstrong number.");
        else
            System.out.println(num + " is not an Armstrong number.");
        
    }
    
}
