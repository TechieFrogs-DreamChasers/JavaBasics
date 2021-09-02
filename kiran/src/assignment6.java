import java.util.Scanner;

public class assignment6 {
    public static void main(String[] args){
        Scanner scannerObj = new Scanner(System.in);
              System.out.println("Enter the 1st Number");
        int x = scannerObj.nextInt();
              System.out.println("Enter the 2nd Number");
        int y = scannerObj.nextInt();
              System.out.println("Enter the 3rd Number");
        int z = scannerObj.nextInt();
           if(x > y && x > y){
               System.out.println("Largest number is :"+ x);
           }
           else if(y>z){
               System.out.println("Largest number is :"+ y);
            }
          else{
              System.out.println("Largest number is :"+ z);
            }
        scannerObj.close();
   
    }
    
}
