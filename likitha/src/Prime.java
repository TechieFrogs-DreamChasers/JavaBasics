import java.util.Scanner;

public class Prime {
  public static void main(String[] args) {
      Scanner scannerObj=new Scanner(System.in);
      System.out.println("enter number");
      int n=scannerObj.nextInt();
      prime(n);



      scannerObj.close();
  }  
  public static boolean prime(int n)
  {
      if(n<=1)
      {
        
        System.out.println("not prime number");
        return false;  
      }
      for(int i=2; i<Math.sqrt(n);i++)
      {
          if(n%i==0)
          {
              
              System.out.println("not prime number");
              return false;
          }
      }
      System.out.println("prime number");
      return true;
  }
}
