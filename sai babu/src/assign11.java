import java.util.Scanner;

public class assign11 {
    public static void main(String[] args) {
        int a,b,gcd,i;
        Scanner ScannerObj = new Scanner(System.in);
        System.out.println("enter the first number");
        a = ScannerObj.nextInt();
        System.out.println("enter the second number");
        b = ScannerObj.nextInt();
        for(i=1; i <= a && i <= b;++i){
            if(a%i==0 && b%i==0)
               gcd=i;
        }
        System.out.println("the gcd of 2 numbers is " + gcd);
        ScannerObj.close();
    }
    
}
