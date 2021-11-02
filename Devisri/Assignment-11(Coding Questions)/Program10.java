import java.util.Scanner;

//Check if number is binary or not
public class Program10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string value: ");
        String input = sc.nextLine();
        if (input.matches("[01]+") && !input.startsWith("0")) {
            System.out.println(input + " is in binary format");
        } else {
            System.out.println(input + " is not in binary format");
        }
        sc.close();
    }
}
/*
Enter a string value:
100101
100101 is in binary format
Enter a string value:
1002501
1002501 is not in binary format
 */