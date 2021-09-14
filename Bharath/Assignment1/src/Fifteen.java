import java.util.Scanner;

public class Fifteen {
    public static void main(String[] args) {
        Scanner pali = new Scanner(System.in);
        System.out.println("Enter a Number:");
        int num = pali.nextInt();
        pali.close();
        int digit = num;
        int r;
        int j = 0;
        while(digit!=0){
            r=digit%10;
            j=j*10+r;
            digit=digit/10;
        }
        if(num==j)
        System.out.println(num+" is a Palindrome");
        else
            System.out.println(num+" is not a Palindrome");
    }
    
}
