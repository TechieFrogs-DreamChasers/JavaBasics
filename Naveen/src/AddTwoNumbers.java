import java.util.Scanner;
public class AddTwoNumbers {
    public static void main(String[] args) {
        
        int i, j, sum;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter First Number: ");
        i = sc.nextInt();
        
        System.out.println("Enter Second Number: ");
        j = sc.nextInt();
        
        sc.close();
        sum = i + j;
        System.out.println("Sum of these numbers: "+sum);
    }
}
/*

  public static void main(String[] args) {
       
     int num1 = 5, num2 = 15, sum;
     sum = num1 + num2;

     System.out.println("Sum of these numbers: "+sum);
  }
}
*/