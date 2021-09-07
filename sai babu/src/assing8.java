import java.util.Scanner;

public class assing8 {
    public static void main(String[] args) {
        int n,fact=1,i;
        Scanner scannerObj=new Scanner(System.in);
        System.out.println("enter the number");
        n=scannerObj.nextInt();
        for(i=n;i>0;i--){
            fact=fact*i;
        }
        System.out.println("the factorial of number is "+fact);
        scannerObj.close();

    }
    
}
