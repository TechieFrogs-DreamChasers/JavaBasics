import java.util.Scanner;

public class LcmWhileloop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter First number: ");
        int a = sc.nextInt();
        System.out.println("Enter Second number: ");
        int b = sc.nextInt();
        int lcm =(a < b)? a:b;
        while (true) {
            if (lcm % a == 0 && lcm % b == 0) {
                System.out.println("The LCM of %d and %d is %d.", a, b, lcm);
                break;
            }
            ++lcm
        }
    }
    
}
