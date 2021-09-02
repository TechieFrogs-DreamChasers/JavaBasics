import java.util.Scanner;

public class AddTwoIntegers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the First number: ");
        int number1=valueInt(scanner);
        System.out.println("Enter the Second number: ");
        int number2=valueInt(scanner);;
        scanner.close();
        int sum=number1+number2;
        System.out.println("Addition of given Two Numbers: " +sum);
    }
    static int valueInt(Scanner sc){
        int num;
        do{
            System.out.println("Enter Your Number: ");
            while (!sc.hasNextInt()){
                System.out.println("Please check the entered value");
                sc.next();
            }
           num = sc.nextInt();
        } while(num <= 0);
        return num;
    }
}
