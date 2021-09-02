import java.util.Scanner;

public class SumofnaturalnumberForloop {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = sc.nextInt();

        int i, sum = 0;
        
        for(i=1;i<=num;++i)
        {
            sum = sum+i;
        }
        System.out.println("sum of First "+num+" Natural number is= "+ sum);
    }
    
}
