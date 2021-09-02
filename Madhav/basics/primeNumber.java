import java.util.Scanner;
public class primeNumber 
{
    public static void main(String args[])
    {
        Scanner scan = new Scanner(System.in);
        int Prime = scan.nextInt();
        int i, count = 0;
        for(i = 2 ; i < Prime ; i++)
        {
            if((Prime%i) == 0)
            {
                count++;
            }
        }
        if(count == 0)
        {
            System.out.println("Its a prime number");

        }
        else
        {
            System.out.println("It is not a prime number");
        }
    }
}
