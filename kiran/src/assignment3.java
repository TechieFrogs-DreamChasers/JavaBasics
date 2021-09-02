import java.util.Scanner;

public class assignment3 {
    public static void main (String args []){
        Scanner scannerObj = new Scanner(System.in);
             System.out.println("Enter value of X");
          int x = scannerObj.nextInt();
             System.out.println("Enter Value of Y");
          int y = scannerObj.nextInt();
          int sum;
         sum = x+y;
         x = sum - x;
         y = sum - y;
             System.out.println("The Values of X and Y after swaping is  "+x +" and "+y);
        scannerObj.close(); 
        


    }
    
}
