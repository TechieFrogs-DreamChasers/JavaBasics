import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int number = scanner.nextInt();
        scanner.close();
        int n=1;
        int factorial=1;
        int fact=1;
        System.out.println("********Using For Loop***********");
        for(int i=1;i<=number;i++){
            factorial=factorial*i;
        }
        System.out.println("factorial of "+number+" is "+factorial);
        System.out.println("********Using While Loop***********");
        while (n<=number){
            fact=fact*n;
            n++;
        }
        System.out.println("factorial of "+number+" is "+factorial);
    }
}
