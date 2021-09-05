import java.util.Scanner;
public class checkEvenOrOdd 
{
    public static void main(String args[])
    {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        String Result = (a%2 == 0) ? "Its even number" : "Its odd Number";
        System.out.println(Result);        
    }
    
}
