import java.util.Scanner;

public class AdditionScanner {
    public static void main(String[] args) {
       /* int a;
        int b;
        int c;*/
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = a+b;
        System.out.println("Addition value is" + c);
        sc.close();

 
    }
    
}
