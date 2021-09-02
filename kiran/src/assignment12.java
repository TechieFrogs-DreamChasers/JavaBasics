import java.util.Scanner;

public class assignment12 {
    public static void main(String[] args){
        Scanner scannerObj = new Scanner(System.in);  
         System.out.print("Enter the first number: ");         
              int x = scannerObj.nextInt();  

          System.out.print("Enter the second number: ");          
              int y = scannerObj.nextInt();  
  
            int i;  

           int a =(x > y)? x : y;  
    
          for(i = a ; i <= x*y ; i = i + a)  
{  
  
            if(i % x == 0 && i % y == 0)  
         break;  
}  
  
System.out.println("LCM of "+x+" and "+y+" is: "+i);
  scannerObj.close();
   }  
}
    

