import java.util.Scanner;

import javax.lang.model.util.ElementScanner14;

public class assign4 {
    public static void main(String[] args) {
        int n;
        Scanner scannerObj=new Scanner(System.in);
        System.out.println("enter the number");
        n=scannerObj.nextInt();
        if(n%2==0)
           System.out.println("the "+n+ " is even");
        else 
           System.out.println("the "+n+ " is odd ");
    }
    
}
