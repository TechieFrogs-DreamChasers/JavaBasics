import java.util.Scanner;

public class Fact {
   public static void main(String[] args) {
       Scanner scannerObj=new Scanner(System.in);
      // int i;
       int fact=1;
       System.out.println("enter number value");
       int num=scannerObj.nextInt();
      /* for(i=1;i<=num;i++)
       {
           fact=fact*i;
       }*/

       int i=1;
       while (i<=num) {
           
           fact=fact*i;
           i++;
       }


       System.out.println("factorial value"+ " " +fact);
       scannerObj.close();

   } 
}
