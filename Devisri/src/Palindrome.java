import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter a Number:");
        int number= scanner.nextInt();
        scanner.close();
        int digit=number;//assuming digit is 151
        int rem;
        int rev=0;
        while(digit!=0){
            rem=digit%10;//rem=151%10=1//15%10=5//1%10=1
            rev=rev*10+rem;//rev=0*10+1=1//1*10+5=15//15*10+1=151
            digit=digit/10;//digit=151/10=15//15/10=1//1/10=0
        }
        if(number==rev)
        System.out.println(number+" is a Palindrome");
        else
            System.out.println(number+" is not a Palindrome");
    }
}
