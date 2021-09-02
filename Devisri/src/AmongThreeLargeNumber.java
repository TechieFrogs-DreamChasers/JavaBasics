import java.util.Scanner;

public class AmongThreeLargeNumber
{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the First number: ");
        int number1=scanner.nextInt();
        System.out.println("Enter the Second number: ");
        int number2=scanner.nextInt();
        System.out.println("Enter the Third number: ");
        int number3=scanner.nextInt();
        scanner.close();

        int max=Math.max(number1,Math.max(number2,number3));
        System.out.println(max +" is the large number among the other two.");
    }
}
