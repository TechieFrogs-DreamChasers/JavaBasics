import java.util.Scanner;

public class Multiplication {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int number = scanner.nextInt();
        scanner.close();
        int j=1;
        System.out.println("********Using For Loop***********");
        for (int i=1;i<=10;i++){
            System.out.println(number+" X "+i+ " = " +(number*i));
        }
        System.out.println("********Using While Loop***********");
        while (j<=10){
            System.out.println(number+" X "+j+ " = " +(number*j));
            j++;
        }
    }
}
