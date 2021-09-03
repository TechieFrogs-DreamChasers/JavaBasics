import java.util.Scanner;

public class GCD {
 public static void main(String[] args) {
     Scanner scannerObj=new Scanner(System.in);
     
     int gcd=0;
     System.out.println("enter the values");
     int n1=scannerObj.nextInt();
     int n2=scannerObj.nextInt();
     gcd=FindGCD(n1,n2);
     System.out.println(gcd);




     scannerObj.close();
 } 

  public static int FindGCD(int n1, int n2)
 {
    while (n2!=0) {
        if(n1>n2)
        {
            n1=n1-n2;
        }
        else{
            n2=n2-n1;
        }
    }
    
   // System.out.println("GCD value is"+ " " +n1);
    return n1;
 }
}