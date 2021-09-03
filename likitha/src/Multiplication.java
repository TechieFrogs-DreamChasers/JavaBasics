import java.util.Scanner;


public class Multiplication {
   public static void main(String[] args) {
      Scanner scannerObj=new Scanner(System.in);

       System.out.println("enter number value:");
       int num=scannerObj.nextInt();
       int i;
       System.out.println("multiplication table for:" + num);
      for(i=1;i<=10;++i)
      {
          int mul;
          mul=num*i;
          
          System.out.println(num + "*" +i+ "=" +mul);
      }

       scannerObj.close();
       
   } 
}
