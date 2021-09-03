import java.util.Scanner;

public class Number {
  public static void main(String[] args) {
      Scanner scannerObj=new Scanner(System.in);
System.out.println("enter num1 value:");
int num1=scannerObj.nextInt();
if(num1%2==0)
{
    System.out.println("even number");

}
else
{
    System.out.println("odd number");
}

      scannerObj.close();

  }  
}
