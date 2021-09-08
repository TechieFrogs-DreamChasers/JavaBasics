import java.util.Scanner;

public class assign7 {
    public static void main(String[] args) {
        char c;
        Scanner ScannerObj = new Scanner(System.in);
        System.out.println("enter the value to c");
        c = ScannerObj.next().charAt(0);
        if(c >= 'a' || c <= 'z')
            System.out.println("the value is alphabet");
        else  
            System.out.println("the value is not alphabet");
        ScannerObj.close();
    }
    
}
