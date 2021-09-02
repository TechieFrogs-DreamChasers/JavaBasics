import java.util.Scanner;

public class SumOfNaturalNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int number = scanner.nextInt();
        scanner.close();
        int counter=0;
        int count=0;
        int n=1;
        System.out.println("********Using For Loop***********");
        for (int i=1;i<=number;i++){
            counter+=i;
        }
        System.out.println("Sum: "+counter);
        System.out.println("********Using While Loop***********");
        while (n<=number){
            count+=n;
            n++;
        }
        System.out.println("Sum: "+count);
    }
}
