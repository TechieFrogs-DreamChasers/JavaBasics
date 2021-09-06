import java.util.Scanner;



public class Alphabet7 {
  public static void main(String[] args) {
      
    Scanner scannerObj=new Scanner(System.in);
    System.out.println("Enter input:");
    String s=scannerObj.next();
    char ch=s.charAt(0);
    if((ch>='a' && ch<='z') || (ch>='A' && ch<='Z'))
    System.out.println("alphabet");
    else
System.out.println("Not an alphabet");

    scannerObj.close();

  }  
}
