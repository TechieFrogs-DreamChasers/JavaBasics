import java.util.Scanner;

public class SumofnatuarlnumbersWhileloop {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = sc.nextInt();
        int i=1,sum=0;
        while (i<=num) {
            sum=sum+i;
            i++;
            
        }
        System.out.println("Sum of First "+num+ " natural Numbers is= "+ sum);
    }
    
}
