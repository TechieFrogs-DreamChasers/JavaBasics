import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        int fact=1;
        Scanner oScanner=new Scanner(System.in);
        System.out.println("enter number");
        int number=oScanner.nextInt();
        for(int i =1;i<=number;i++){
           
             fact=fact*i;
            
            

        }
        System.out.println("factorial is:"+  fact);

        oScanner.close();
    }
    
}
