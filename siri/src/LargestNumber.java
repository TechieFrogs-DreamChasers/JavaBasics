import java.util.Scanner;

public class LargestNumber {
    public static void main(String[] args) {
        int a,b,c,d,large;
        Scanner oScanner=new Scanner(System.in);
        System.out.println("enter number");
        a=oScanner.nextInt();
        System.out.println("enter number");
        b=oScanner.nextInt();
        System.out.println("enter number");
        c=oScanner.nextInt();
        d=a>b?a:b;
        large=c>d?c:d;
        System.out.println("the largest numbe is:"+large);
        oScanner.close();


    }
    
}
