import java.util.Scanner;
public class Armstrong {
    public static void main(String args[])
    {
        int n, temp, num=0, rem;
        Scanner scan = new Scanner(System.in);
		
        System.out.print("Enter any Positive Number : ");
        n = scan.nextInt();
		
        temp = n;
		
        while(temp != 0)
        {
            rem = temp%10;
            num = num + rem*rem*rem;
            temp = temp/10;
        }
        if(num == n)
        {
            System.out.print("Armstrong Number");
        }
        else
        {
            System.out.print("Not an Armstrong Number");
        }
    }
    
}
