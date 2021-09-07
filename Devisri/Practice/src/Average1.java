import java.util.Scanner;

public class Average1 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int num1=checkIntValues(sc);
        int num2=checkIntValues(sc);
        double num3=checkDoubleValues(sc);
        double num4=checkDoubleValues(sc);
        sc.close();
        int average=(int)(num1+num2+num3+num4)/4;
        System.out.println("The Average1 of entered numbers is: "+average);
    }
    static int checkIntValues(Scanner scanner){
        int number;
        do{
            System.out.println("Enter a Valid Number: ");
            while (!(scanner.hasNextInt())){
                System.out.println("Please check the entered input again ");
                scanner.next();
            }
            number=scanner.nextInt();
        }while(number<=0);
        return number;
    }
    static double checkDoubleValues(Scanner scanner){
        double number;
        System.out.println("Enter a Double Number: ");
        do{
            System.out.println("Enter a Valid Number: ");
            while (!(scanner.hasNextDouble())){
                System.out.println("Please check the entered input again ");
                scanner.next();
            }
            number=scanner.nextDouble();
        }while(number<=0);
        return number;
    }
}
