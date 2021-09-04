import java.util.Scanner;

public class Multiplication {
    public static void main(String[] args)
    {
        int num , i = 1;
        Scanner sc = new Scanner(System.in);
        System.out.println( " Enter the number");
        num = sc.nextInt();
        System.out.println("Multiplication of " +num+ " is ");
        while(i<=10)
        {
            System.out.println(num+ " * " + i + " = " +num*i);
            i++;
        }
        
 
    }
    
}
