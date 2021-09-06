import java.util.Scanner;

public class assign9 {
    public static void main(String[] args) {
        int n,sum=0,i=1;
        Scanner scannerObj=new Scanner(System.in);
        System.out.println("enter the number");
        n=scannerObj.nextInt();
        while(i<=n){
            sum=sum+i;
            
            i++;
        
        }
        System.out.println("the sum of n natural numbers is "+sum);
        scannerObj.close();
    }
    
}
