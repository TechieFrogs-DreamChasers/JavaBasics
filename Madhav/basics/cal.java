import java.util.Scanner;


 public class cal
{
    public static void main(String args[])
    {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        int Q = a/b;
        int R = a%b;
        System.out.println("The quoient is "+Q);
        System.out.println("The Remainder is "+R);

    }
}
