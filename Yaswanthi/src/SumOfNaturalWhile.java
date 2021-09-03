import java.util.Scanner;

public class SumOfNaturalWhile {
    public static void main(String[] args)
    {
        int num , sum=0, i=1;
       Scanner sc = new Scanner(System.in);
       num = sc.nextInt();
       while(i<=num)
       {
           sum = sum +i;
           i++;
       }
       System.out.println("Sum of natural numbers up to " +sum );
    }
    
}
