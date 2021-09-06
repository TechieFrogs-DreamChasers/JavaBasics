import java.util.Scanner;

public class assing10 {
    public static void main(String[] args) {
            int n,i;
            Scanner scannerObj=new Scanner(System.in);
            System.out.println("enter the number");
            n=scannerObj.nextInt();
            for(i=1;i<=10;i++){
                System.out.println(n + " * " + i + " = " + n*i );
            }
            scannerObj.close();
    }
    
}
