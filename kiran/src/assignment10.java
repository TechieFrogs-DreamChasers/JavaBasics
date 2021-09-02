import java.util.Scanner;

public class assignment10 {
    public static void main(String[] args){
        System.out.println("Enter the Number");
        Scanner scannerObj = new Scanner(System.in);
        int x = scannerObj.nextInt();
        for(int i = 1; i <= 10; i++){
            System.out.println(x+" * "+i+" = "+x*i);
            scannerObj.close();
        }
        
    }
    
}
