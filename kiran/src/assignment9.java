import java.util.Scanner;

public class assignment9 {
    public static void main(String[] args){
        Scanner scannerObj = new Scanner(System.in);
        System.out.println("Enter the Number");
        int a = scannerObj.nextInt();
        int b = 1;
        int sum = 0;
        while(b <= a){
            sum = sum+b;
            b++;
        }   
        System.out.println("The sum of Natural Number "+ a +" is : "+sum);
        scannerObj.close();
        

        
    }
    
}
